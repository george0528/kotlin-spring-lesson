<template>
  <div>
    Page Test content
    <NuxtLink to="/">
      indexです
    </NuxtLink>
    <input v-model="name" type="text" />
    <p>nameの値は{{ name }}</p>
    <p>numは{{ num }}</p>
    <button @click="double()">倍にする</button>
  </div>
</template>
<script setup>
  const name = ref('Test') // 変数
  const num = ref(1)
  const double = () => {
    num.value *= 2
  }
</script>

<style lang="scss" scoped>

</style>