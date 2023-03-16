import { extendZodWithOpenApi, OpenAPIGenerator, OpenAPIRegistry } from '@asteasolutions/zod-to-openapi'
import { writeFileSync } from 'fs'
import { z } from 'zod'

extendZodWithOpenApi(z)

const registry = new OpenAPIRegistry()

const KeySchema = registry.register(
  'Key',
  z.object({
    id: z.string().uuid().openapi({ example: 'd1f93776-c39c-11ed-afa1-0242ac120002' }),
    name: z
      .string()
      .min(2)
      .max(64)
      .regex(/[a-z][a-z0-9-]+/)
      .openapi({ example: 'key-1' }),
    displayName: z
      .string()
      .min(2)
      .max(256)
      .regex(/[\w ,.'()-]+/)
      .openapi({ example: 'Key 1' }),
    shortDisplayName: z
      .string()
      .min(2)
      .max(16)
      .regex(/[\w ,.'()-]+/)
      .openapi({ example: 'K1' }),
    description: z
      .string()
      .min(2)
      .max(1024)
      .regex(/[\w ,.'()-]+/)
      .openapi({ example: 'Our First Key' }),
  })
)

const KeyListSchema = registry.register('KeyList', z.array(KeySchema))

const bearerAuth = registry.registerComponent('securitySchemes', 'bearerAuth', {
  type: 'http',
  scheme: 'bearer',
  bearerFormat: 'JWT',
})

registry.registerPath({
  method: 'get',
  path: '/key',
  description: 'Get all keys',
  summary: 'All keys',
  security: [{ [bearerAuth.name]: [] }],
  responses: {
    200: {
      description: 'Key list data',
      content: {
        'application/json': {
          schema: KeyListSchema,
        },
      },
    },
    204: {
      description: 'No content - successful operation',
    },
  },
})

function getOpenApiDocumentation() {
  const generator = new OpenAPIGenerator(registry.definitions, '3.0.0')

  return generator.generateDocument({
    info: {
      version: '1.0.0',
      title: 'My API',
      description: 'This is the API',
    },
    servers: [{ url: 'https://localhost:8443/api/v1' }],
  })
}

function writeDocumentation() {
  // OpenAPI JSON
  const docs = getOpenApiDocumentation()

  // YAML equivalent
  const fileContent = JSON.stringify(docs, null, 2)

  writeFileSync(new URL('../output/openapi-docs.json', import.meta.url), fileContent, {
    encoding: 'utf-8',
  })
}

writeDocumentation()
