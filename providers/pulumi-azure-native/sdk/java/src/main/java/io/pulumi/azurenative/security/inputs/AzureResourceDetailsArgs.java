// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Details of the Azure resource that was assessed
 * 
 */
public final class AzureResourceDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureResourceDetailsArgs Empty = new AzureResourceDetailsArgs();

    /**
     * The platform where the assessed resource resides
     * Expected value is 'Azure'.
     * 
     */
    @InputImport(name="source", required=true)
      private final Input<String> source;

    public Input<String> getSource() {
        return this.source;
    }

    public AzureResourceDetailsArgs(Input<String> source) {
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
    }

    private AzureResourceDetailsArgs() {
        this.source = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureResourceDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> source;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureResourceDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.source = defaults.source;
        }

        public Builder setSource(Input<String> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder setSource(String source) {
            this.source = Input.of(Objects.requireNonNull(source));
            return this;
        }
        public AzureResourceDetailsArgs build() {
            return new AzureResourceDetailsArgs(source);
        }
    }
}
