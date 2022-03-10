import {BaseModel} from '../base/base.model';
import { Attributes } from './attributes.model';

export type Avocado = BaseModel & {
  name: string
  sku: string
  price: number
  image: string
  attributes: Attributes
}
