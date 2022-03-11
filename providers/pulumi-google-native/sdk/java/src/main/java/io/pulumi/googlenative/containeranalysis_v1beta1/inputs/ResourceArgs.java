// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * An entity that can have metadata. For example, a Docker image.
 * 
 */
public final class ResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceArgs Empty = new ResourceArgs();

    /**
     * The unique URI of the resource. For example, `https://gcr.io/project/image@sha256:foo` for a Docker image.
     * 
     */
    @InputImport(name="uri", required=true)
      private final Output<String> uri;

    public Output<String> getUri() {
        return this.uri;
    }

    public ResourceArgs(Output<String> uri) {
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private ResourceArgs() {
        this.uri = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.uri = defaults.uri;
        }

        public Builder uri(Output<String> uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public Builder uri(String uri) {
            this.uri = Output.of(Objects.requireNonNull(uri));
            return this;
        }
        public ResourceArgs build() {
            return new ResourceArgs(uri);
        }
    }
}
