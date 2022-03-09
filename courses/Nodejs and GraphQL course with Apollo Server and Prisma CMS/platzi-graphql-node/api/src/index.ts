import { ApolloServer } from 'apollo-server';

// 1 - Query
const typeDefs = `
  type Query {
    info: String!
  }
`;

// 2 - Resolvers
const resolvers = {
  Query: {
    info: () => 'This is the API of Platzi Node Graphql',
  }
};

// 3 -  Init Server
const server = new ApolloServer({
  typeDefs,
  resolvers
});

server.listen().then(({ url }) => console.log(`Server is running on ${url}`));
