declare module '*.gql' {
  import { DocumentNode } from '~~/gql'

  const content: DocumentNode
  export default content
}

declare module '*.graphql' {
  import { DocumentNode } from '~~/gql'

  const content: DocumentNode
  export default content
}