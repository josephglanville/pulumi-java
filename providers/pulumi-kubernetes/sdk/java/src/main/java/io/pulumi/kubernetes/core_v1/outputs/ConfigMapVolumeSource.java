// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.kubernetes.core_v1.outputs.KeyToPath;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConfigMapVolumeSource {
    /**
     * Optional: mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    private final @Nullable Integer defaultMode;
    /**
     * If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the ConfigMap, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.
     * 
     */
    private final @Nullable List<KeyToPath> items;
    /**
     * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     * 
     */
    private final @Nullable String name;
    /**
     * Specify whether the ConfigMap or its keys must be defined
     * 
     */
    private final @Nullable Boolean optional;

    @CustomType.Constructor
    private ConfigMapVolumeSource(
        @CustomType.Parameter("defaultMode") @Nullable Integer defaultMode,
        @CustomType.Parameter("items") @Nullable List<KeyToPath> items,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("optional") @Nullable Boolean optional) {
        this.defaultMode = defaultMode;
        this.items = items;
        this.name = name;
        this.optional = optional;
    }

    /**
     * Optional: mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
    */
    public Optional<Integer> getDefaultMode() {
        return Optional.ofNullable(this.defaultMode);
    }
    /**
     * If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the ConfigMap, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.
     * 
    */
    public List<KeyToPath> getItems() {
        return this.items == null ? List.of() : this.items;
    }
    /**
     * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Specify whether the ConfigMap or its keys must be defined
     * 
    */
    public Optional<Boolean> getOptional() {
        return Optional.ofNullable(this.optional);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigMapVolumeSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer defaultMode;
        private @Nullable List<KeyToPath> items;
        private @Nullable String name;
        private @Nullable Boolean optional;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigMapVolumeSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultMode = defaults.defaultMode;
    	      this.items = defaults.items;
    	      this.name = defaults.name;
    	      this.optional = defaults.optional;
        }

        public Builder defaultMode(@Nullable Integer defaultMode) {
            this.defaultMode = defaultMode;
            return this;
        }
        public Builder items(@Nullable List<KeyToPath> items) {
            this.items = items;
            return this;
        }
        public Builder items(KeyToPath... items) {
            return items(List.of(items));
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder optional(@Nullable Boolean optional) {
            this.optional = optional;
            return this;
        }        public ConfigMapVolumeSource build() {
            return new ConfigMapVolumeSource(defaultMode, items, name, optional);
        }
    }
}
