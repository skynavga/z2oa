
# z2oa (zod-to-openapi example)

This repository contains a simple example of using
[`zod-to-openapi`](https://github.com/asteasolutions/zod-to-openapi).

## Prerequisites

The following tools must already be present to perform the remaining steps:

- `node`
- `yarn`
- `tsc`
- `prettier`
- `eslint`

You may be able to install these using `brew`.

## Install Dependencies

```yarn
yarn install
```

##  Build Distribution

```yarn
yarn build
```

## Run Example

```yarn
yarn start
```

This step performs the Zod to OpenApi example generation, with the output
writing results to `output/openapi-docs.json`.
