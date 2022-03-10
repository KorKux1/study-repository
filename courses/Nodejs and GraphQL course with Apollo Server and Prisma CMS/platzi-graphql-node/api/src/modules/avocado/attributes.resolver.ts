import { Attributes } from "./attributes.model"

export const resolver: Record<keyof Attributes, (parent: Attributes) => unknown> = {
  description: (parent) => parent.description,
  shape: (parent) => parent.shape,
  hardiness: (parent) => parent.hardiness,
  taste: (parent) => parent.taste
}
