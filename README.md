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

## Supported versions

- Minecraft 1.20.1 — Java 17
- Minecraft 1.21.1–1.21.11 — Java 21
- Minecraft 26.1 and 26.1.2 — Java 25

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

## License

DamageNumbers is available under the [MIT License](LICENSE). Bundled fonts retain their licenses in `META-INF/licenses/damage-numbers/`.
