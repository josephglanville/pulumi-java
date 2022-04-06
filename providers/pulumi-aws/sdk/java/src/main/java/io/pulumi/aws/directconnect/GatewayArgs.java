// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.directconnect;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GatewayArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayArgs Empty = new GatewayArgs();

    /**
     * The ASN to be configured on the Amazon side of the connection. The ASN must be in the private range of 64,512 to 65,534 or 4,200,000,000 to 4,294,967,294.
     * 
     */
    @Import(name="amazonSideAsn", required=true)
      private final Output<String> amazonSideAsn;

    public Output<String> getAmazonSideAsn() {
        return this.amazonSideAsn;
    }

    /**
     * The name of the connection.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    public GatewayArgs(
        Output<String> amazonSideAsn,
        @Nullable Output<String> name) {
        this.amazonSideAsn = Objects.requireNonNull(amazonSideAsn, "expected parameter 'amazonSideAsn' to be non-null");
        this.name = name;
    }

    private GatewayArgs() {
        this.amazonSideAsn = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> amazonSideAsn;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amazonSideAsn = defaults.amazonSideAsn;
    	      this.name = defaults.name;
        }

        public Builder amazonSideAsn(Output<String> amazonSideAsn) {
            this.amazonSideAsn = Objects.requireNonNull(amazonSideAsn);
            return this;
        }
        public Builder amazonSideAsn(String amazonSideAsn) {
            this.amazonSideAsn = Output.of(Objects.requireNonNull(amazonSideAsn));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }        public GatewayArgs build() {
            return new GatewayArgs(amazonSideAsn, name);
        }
    }
}