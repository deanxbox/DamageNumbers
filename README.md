<img width="2172" height="724" alt="banner" src="https://github.com/user-attachments/assets/52c62a01-8ed5-4f99-8bdf-709217276fc2" />


# DamageNumbers

DamageNumbers is a Fabric mod that displays configurable floating damage values at world-space hit locations.

## Features

- Styles for separate damage ranges.
- Built-in and user presets.
- Solid colors and directional gradients.
- Custom TTF and OTF fonts.
- Configurable scale, outline, lifetime, animation, and spawn radius.
- Optional tracking of damage from every source.
- Live previews in the Mod Menu settings screen.

## Requirements

- **Mod Menu** (for in-game settings entry)

## Installation

1. Install Fabric Loader & Fabric API for **Minecraft**.
2. Put this mod’s JAR into your `mods/` folder.
3. Add **Mod Menu** for an in-game settings UI.

## Configuration

### In-game
After **Mod Menu** are installed:
- Open **Mods → DamageNumbers → Configure**.

## Building

Use JDK 25 to build every supported version:

```powershell
.\gradlew.bat buildAll
```

Build one version with its Gradle task:

```powershell
.\gradlew.bat :versions:mc1_21_11:build
```

Release JARs are collected in `build/releases/`. Per-version JARs and source archives remain in
`versions/<version>/build/libs/`.

## Credits & Attribution

- **Original author & idea credit:** [mel1x](https://www.curseforge.com/members/mel1x/projects)

## License

DamageNumbers is available under the [MIT License](LICENSE). Bundled fonts retain their licenses in `META-INF/licenses/damage-numbers/`.
