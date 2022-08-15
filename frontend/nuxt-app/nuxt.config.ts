import { defineNuxtConfig } from 'nuxt'

// https://v3.nuxtjs.org/api/configuration/nuxt.config
export default defineNuxtConfig({
  // Modules (https://go.nuxtjs.dev/config-modules)
  modules: [
    '@nuxtjs/apollo',
  ],

  // Apollo module configuration
  apollo: {
    clientConfigs: {
      default: {
        httpEndpoint: 'https://graphql-pokemon2.vercel.app/',
      }
    }
  },
})
