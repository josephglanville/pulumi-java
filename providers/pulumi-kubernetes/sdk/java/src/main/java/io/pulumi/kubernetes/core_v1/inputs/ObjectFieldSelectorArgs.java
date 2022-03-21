// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ObjectFieldSelector selects an APIVersioned field of an object.
 * 
 */
public final class ObjectFieldSelectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final ObjectFieldSelectorArgs Empty = new ObjectFieldSelectorArgs();

    /**
     * Version of the schema the FieldPath is written in terms of, defaults to "v1".
     * 
     */
    @Import(name="apiVersion")
      private final @Nullable Output<String> apiVersion;

    public Output<String> getApiVersion() {
        return this.apiVersion == null ? Output.empty() : this.apiVersion;
    }

    /**
     * Path of the field to select in the specified API version.
     * 
     */
    @Import(name="fieldPath", required=true)
      private final Output<String> fieldPath;

    public Output<String> getFieldPath() {
        return this.fieldPath;
    }

    public ObjectFieldSelectorArgs(
        @Nullable Output<String> apiVersion,
        Output<String> fieldPath) {
        this.apiVersion = apiVersion;
        this.fieldPath = Objects.requireNonNull(fieldPath, "expected parameter 'fieldPath' to be non-null");
    }

    private ObjectFieldSelectorArgs() {
        this.apiVersion = Output.empty();
        this.fieldPath = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectFieldSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> apiVersion;
        private Output<String> fieldPath;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectFieldSelectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.fieldPath = defaults.fieldPath;
        }

        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = Output.ofNullable(apiVersion);
            return this;
        }
        public Builder fieldPath(Output<String> fieldPath) {
            this.fieldPath = Objects.requireNonNull(fieldPath);
            return this;
        }
        public Builder fieldPath(String fieldPath) {
            this.fieldPath = Output.of(Objects.requireNonNull(fieldPath));
            return this;
        }        public ObjectFieldSelectorArgs build() {
            return new ObjectFieldSelectorArgs(apiVersion, fieldPath);
        }
    }
}
