<template>
  <div id="app">
    <div class="menu">
      <button class="open-menu-btn" v-if="!isMenuOpen" @click="toggleMenu">Open</button>
      <button class="close-menu-btn" v-if="isMenuOpen" @click="toggleMenu">Close</button>
      <div class="menu-content" v-if="isMenuOpen">
        <div class="menu-item">Home</div>
        <div class="menu-item">About</div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'App',
  data: function() {
    return {
      isMenuOpen: false
    }
  },
  methods: {
    toggleMenu() {
      this.isMenuOpen = !this.isMenuOpen;
    }
  }
}
</script>

<style lang="scss" scoped>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}

</style>
