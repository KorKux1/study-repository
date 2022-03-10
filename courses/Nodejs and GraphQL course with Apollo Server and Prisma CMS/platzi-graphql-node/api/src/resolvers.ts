import * as avo from './modules/avocado/avocado.resolver'
import * as scalars from './modules/base/scalars.model'
import * as attributes from './modules/avocado/attributes.resolver'

export default {
  ...scalars,
  Query: {
    avo: avo.findOne,
    avos: avo.findAll,
  },
  Mutation: {
    createAvo: avo.createAvo,
  },
  Avocado: avo.resolver,
  Attributes: attributes.resolver,
}
