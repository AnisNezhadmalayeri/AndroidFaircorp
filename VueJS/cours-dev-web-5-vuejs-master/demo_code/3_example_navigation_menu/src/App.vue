<template>
  <div id="app">
    <header>
      <div class="title">{{title}}</div>
    </header>

    <section class="main-content w-50 mx-auto">
      <main-navigation @panel-change="updatePanel"></main-navigation>
      <panel-a v-if="currentPanel.name === 'panelA'"></panel-a>
      <panel-b v-if="currentPanel.name === 'panelB'"></panel-b>
    </section>
  </div>
</template>

<script>
import MainNavigation from './components/MainNavigation.vue';
import PanelA from './components/PanelA.vue';
import PanelB from './components/PanelB.vue';

export default {
  name: 'App',
  components: {
    MainNavigation,
    PanelB,
    PanelA
},
  data: function() {
    return {
      title: 'My App Title',
      currentPanel: {}
    }
  },
  methods: {
    updatePanel(newPanel) {
      this.currentPanel = newPanel;
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
