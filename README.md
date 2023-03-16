# z2oa (zod-to-openapi example)

This repository contains a simple example of using
[`zod-to-openapi`](https://github.com/asteasolutions/zod-to-openapi).

## Prerequisites

The following tools must already be present to perform the remaining steps:

- `node`
- `yarn`
- `tsc`
- `eslint`
- `swagger-codgen` (optional, see more below)

You can install these using `brew` or `nodenv` (for `node`).

## Install Dependencies

```yarn
yarn install
```

## Build Distribution

```yarn
yarn build
```

## Run Example

```yarn
yarn start
```

This step performs the Zod to OpenApi example generation, with the output
written to `output/openapi-docs.json`, a sample of which is
included in this repository.

## Generate Kotlin Server Stubs from OpenApi Spec

The resulting OpenApi specification may be used to generate a Kotlin
Server by using the `swagger-codegen` tool via:

```yarn
yarn run oa2ks
```

The generated stubs are written to `output/kotlin-server`, a sample of
which is included in this repository.

## Generate Java Spring Server Stubs from OpenApi Spec

The resulting OpenApi specification may be used to generate a Java
Spring Server by using the `swagger-codegen` tool via

```yarn
yarn run oa2sp
```

The generated stubs are written to `output/spring`, a sample of
which is included in this repository.
