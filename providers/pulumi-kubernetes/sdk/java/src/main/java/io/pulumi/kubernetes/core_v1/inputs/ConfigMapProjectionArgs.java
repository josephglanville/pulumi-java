// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.core_v1.inputs.KeyToPathArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Adapts a ConfigMap into a projected volume.
 * 
 * The contents of the target ConfigMap's Data field will be presented in a projected volume as files using the keys in the Data field as the file names, unless the items element is populated with specific mappings of keys to paths. Note that this is identical to a configmap volume source without the default mode.
 * 
 */
public final class ConfigMapProjectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigMapProjectionArgs Empty = new ConfigMapProjectionArgs();

    /**
     * If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the ConfigMap, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.
     * 
     */
    @Import(name="items")
      private final @Nullable Output<List<KeyToPathArgs>> items;

    public Output<List<KeyToPathArgs>> getItems() {
        return this.items == null ? Codegen.empty() : this.items;
    }

    /**
     * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Specify whether the ConfigMap or its keys must be defined
     * 
     */
    @Import(name="optional")
      private final @Nullable Output<Boolean> optional;

    public Output<Boolean> getOptional() {
        return this.optional == null ? Codegen.empty() : this.optional;
    }

    public ConfigMapProjectionArgs(
        @Nullable Output<List<KeyToPathArgs>> items,
        @Nullable Output<String> name,
        @Nullable Output<Boolean> optional) {
        this.items = items;
        this.name = name;
        this.optional = optional;
    }

    private ConfigMapProjectionArgs() {
        this.items = Codegen.empty();
        this.name = Codegen.empty();
        this.optional = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigMapProjectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<KeyToPathArgs>> items;
        private @Nullable Output<String> name;
        private @Nullable Output<Boolean> optional;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigMapProjectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
    	      this.name = defaults.name;
    	      this.optional = defaults.optional;
        }

        public Builder items(@Nullable Output<List<KeyToPathArgs>> items) {
            this.items = items;
            return this;
        }
        public Builder items(@Nullable List<KeyToPathArgs> items) {
            this.items = Codegen.ofNullable(items);
            return this;
        }
        public Builder items(KeyToPathArgs... items) {
            return items(List.of(items));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder optional(@Nullable Output<Boolean> optional) {
            this.optional = optional;
            return this;
        }
        public Builder optional(@Nullable Boolean optional) {
            this.optional = Codegen.ofNullable(optional);
            return this;
        }        public ConfigMapProjectionArgs build() {
            return new ConfigMapProjectionArgs(items, name, optional);
        }
    }
}
