<template>
  <ul class="nav nav-tabs">
    <li class="nav-item" v-for="panel in panels" :key="panel.id">
      <a 
        class="nav-link" 
        :class="{active: panel.id === currentPanel.id}"
        aria-current="page" href="#"
        @click="changePanel(panel)"
      >{{panel.tabDisplay}}</a>
    </li>
  </ul>
</template>


<script>
export default {
  name: 'MainNavigation',
  data: function() {
    return {
      currentPanel: null,
      panels: [{
        id: 0,
        name: 'panelA',
        tabDisplay: 'Panel A'
      }, {
        id: 1,
        name: 'panelB',
        tabDisplay: 'Panel B'
      }]
    }
  },
  methods: {
    changePanel(newPanel) {
      this.currentPanel = newPanel;
      this.$emit('panel-change', newPanel);
    }
  },
  created: function() {
    this.changePanel(this.panels[0]);
  }
}
</script>
