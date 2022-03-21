// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ConfigMap holds configuration data for pods to consume.
 * 
 */
public final class ConfigMapArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigMapArgs Empty = new ConfigMapArgs();

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @Import(name="apiVersion")
      private final @Nullable Output<String> apiVersion;

    public Output<String> getApiVersion() {
        return this.apiVersion == null ? Output.empty() : this.apiVersion;
    }

    /**
     * BinaryData contains the binary data. Each key must consist of alphanumeric characters, '-', '_' or '.'. BinaryData can contain byte sequences that are not in the UTF-8 range. The keys stored in BinaryData must not overlap with the ones in the Data field, this is enforced during validation process. Using this field will require 1.10+ apiserver and kubelet.
     * 
     */
    @Import(name="binaryData")
      private final @Nullable Output<Map<String,String>> binaryData;

    public Output<Map<String,String>> getBinaryData() {
        return this.binaryData == null ? Output.empty() : this.binaryData;
    }

    /**
     * Data contains the configuration data. Each key must consist of alphanumeric characters, '-', '_' or '.'. Values with non-UTF-8 byte sequences must use the BinaryData field. The keys stored in Data must not overlap with the keys in the BinaryData field, this is enforced during validation process.
     * 
     */
    @Import(name="data")
      private final @Nullable Output<Map<String,String>> data;

    public Output<Map<String,String>> getData() {
        return this.data == null ? Output.empty() : this.data;
    }

    /**
     * Immutable, if set to true, ensures that data stored in the ConfigMap cannot be updated (only object metadata can be modified). If not set to true, the field can be modified at any time. Defaulted to nil.
     * 
     */
    @Import(name="immutable")
      private final @Nullable Output<Boolean> immutable;

    public Output<Boolean> getImmutable() {
        return this.immutable == null ? Output.empty() : this.immutable;
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    /**
     * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<ObjectMetaArgs> metadata;

    public Output<ObjectMetaArgs> getMetadata() {
        return this.metadata == null ? Output.empty() : this.metadata;
    }

    public ConfigMapArgs(
        @Nullable Output<String> apiVersion,
        @Nullable Output<Map<String,String>> binaryData,
        @Nullable Output<Map<String,String>> data,
        @Nullable Output<Boolean> immutable,
        @Nullable Output<String> kind,
        @Nullable Output<ObjectMetaArgs> metadata) {
        this.apiVersion = apiVersion;
        this.binaryData = binaryData;
        this.data = data;
        this.immutable = immutable;
        this.kind = kind;
        this.metadata = metadata;
    }

    private ConfigMapArgs() {
        this.apiVersion = Output.empty();
        this.binaryData = Output.empty();
        this.data = Output.empty();
        this.immutable = Output.empty();
        this.kind = Output.empty();
        this.metadata = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigMapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> apiVersion;
        private @Nullable Output<Map<String,String>> binaryData;
        private @Nullable Output<Map<String,String>> data;
        private @Nullable Output<Boolean> immutable;
        private @Nullable Output<String> kind;
        private @Nullable Output<ObjectMetaArgs> metadata;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigMapArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.binaryData = defaults.binaryData;
    	      this.data = defaults.data;
    	      this.immutable = defaults.immutable;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
        }

        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = Output.ofNullable(apiVersion);
            return this;
        }
        public Builder binaryData(@Nullable Output<Map<String,String>> binaryData) {
            this.binaryData = binaryData;
            return this;
        }
        public Builder binaryData(@Nullable Map<String,String> binaryData) {
            this.binaryData = Output.ofNullable(binaryData);
            return this;
        }
        public Builder data(@Nullable Output<Map<String,String>> data) {
            this.data = data;
            return this;
        }
        public Builder data(@Nullable Map<String,String> data) {
            this.data = Output.ofNullable(data);
            return this;
        }
        public Builder immutable(@Nullable Output<Boolean> immutable) {
            this.immutable = immutable;
            return this;
        }
        public Builder immutable(@Nullable Boolean immutable) {
            this.immutable = Output.ofNullable(immutable);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Output.ofNullable(kind);
            return this;
        }
        public Builder metadata(@Nullable Output<ObjectMetaArgs> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable ObjectMetaArgs metadata) {
            this.metadata = Output.ofNullable(metadata);
            return this;
        }        public ConfigMapArgs build() {
            return new ConfigMapArgs(apiVersion, binaryData, data, immutable, kind, metadata);
        }
    }
}
