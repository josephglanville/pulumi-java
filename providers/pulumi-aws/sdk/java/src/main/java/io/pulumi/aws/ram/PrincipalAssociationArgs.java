// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ram;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class PrincipalAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrincipalAssociationArgs Empty = new PrincipalAssociationArgs();

    /**
     * The principal to associate with the resource share. Possible values are an AWS account ID, an AWS Organizations Organization ARN, or an AWS Organizations Organization Unit ARN.
     * 
     */
    @Import(name="principal", required=true)
      private final Output<String> principal;

    public Output<String> getPrincipal() {
        return this.principal;
    }

    /**
     * The Amazon Resource Name (ARN) of the resource share.
     * 
     */
    @Import(name="resourceShareArn", required=true)
      private final Output<String> resourceShareArn;

    public Output<String> getResourceShareArn() {
        return this.resourceShareArn;
    }

    public PrincipalAssociationArgs(
        Output<String> principal,
        Output<String> resourceShareArn) {
        this.principal = Objects.requireNonNull(principal, "expected parameter 'principal' to be non-null");
        this.resourceShareArn = Objects.requireNonNull(resourceShareArn, "expected parameter 'resourceShareArn' to be non-null");
    }

    private PrincipalAssociationArgs() {
        this.principal = Output.empty();
        this.resourceShareArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrincipalAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> principal;
        private Output<String> resourceShareArn;

        public Builder() {
    	      // Empty
        }

        public Builder(PrincipalAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principal = defaults.principal;
    	      this.resourceShareArn = defaults.resourceShareArn;
        }

        public Builder principal(Output<String> principal) {
            this.principal = Objects.requireNonNull(principal);
            return this;
        }
        public Builder principal(String principal) {
            this.principal = Output.of(Objects.requireNonNull(principal));
            return this;
        }
        public Builder resourceShareArn(Output<String> resourceShareArn) {
            this.resourceShareArn = Objects.requireNonNull(resourceShareArn);
            return this;
        }
        public Builder resourceShareArn(String resourceShareArn) {
            this.resourceShareArn = Output.of(Objects.requireNonNull(resourceShareArn));
            return this;
        }        public PrincipalAssociationArgs build() {
            return new PrincipalAssociationArgs(principal, resourceShareArn);
        }
    }
}