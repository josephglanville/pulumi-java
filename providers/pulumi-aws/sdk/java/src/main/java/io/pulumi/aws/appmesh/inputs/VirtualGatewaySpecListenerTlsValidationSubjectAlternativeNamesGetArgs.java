// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesMatchGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;


public final class VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesGetArgs Empty = new VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesGetArgs();

    /**
     * The criteria for determining a SAN's match.
     * 
     */
    @Import(name="match", required=true)
      private final Output<VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesMatchGetArgs> match;

    public Output<VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesMatchGetArgs> getMatch() {
        return this.match;
    }

    public VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesGetArgs(Output<VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesMatchGetArgs> match) {
        this.match = Objects.requireNonNull(match, "expected parameter 'match' to be non-null");
    }

    private VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesGetArgs() {
        this.match = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesMatchGetArgs> match;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.match = defaults.match;
        }

        public Builder match(Output<VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesMatchGetArgs> match) {
            this.match = Objects.requireNonNull(match);
            return this;
        }
        public Builder match(VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesMatchGetArgs match) {
            this.match = Output.of(Objects.requireNonNull(match));
            return this;
        }        public VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesGetArgs build() {
            return new VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesGetArgs(match);
        }
    }
}
