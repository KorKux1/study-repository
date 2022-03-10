import { GraphQLScalarType, Kind } from 'graphql'

export const DateTime = new GraphQLScalarType({
  name: 'DateTime',
  description: 'Represents a date time object',
  serialize(value): string {
    if( !(value instanceof Date) ) {
      throw new TypeError(`DateTime can only serialize Date values`)
    }
    return value.toISOString() // Convert outgoing Date to ISOString for JSON
  },
  parseValue(value) {
    if (typeof value !== "string") {
      throw new TypeError(`DateTime can only parse strings`)
    }
    return new Date(value) // Convert incoming integer to Date
  },
  parseLiteral(ast) {
    if (ast.kind === Kind.INT) {
      return new Date(parseInt(ast.value, 10)) // Convert hard-coded AST string to integer and then to Date
    }
    return null // Invalid hard-coded value (not an integer)
  },
})
