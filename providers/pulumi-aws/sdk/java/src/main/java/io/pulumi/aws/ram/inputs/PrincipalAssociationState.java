// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ram.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrincipalAssociationState extends io.pulumi.resources.ResourceArgs {

    public static final PrincipalAssociationState Empty = new PrincipalAssociationState();

    /**
     * The principal to associate with the resource share. Possible values are an AWS account ID, an AWS Organizations Organization ARN, or an AWS Organizations Organization Unit ARN.
     * 
     */
    @Import(name="principal")
      private final @Nullable Output<String> principal;

    public Output<String> getPrincipal() {
        return this.principal == null ? Output.empty() : this.principal;
    }

    /**
     * The Amazon Resource Name (ARN) of the resource share.
     * 
     */
    @Import(name="resourceShareArn")
      private final @Nullable Output<String> resourceShareArn;

    public Output<String> getResourceShareArn() {
        return this.resourceShareArn == null ? Output.empty() : this.resourceShareArn;
    }

    public PrincipalAssociationState(
        @Nullable Output<String> principal,
        @Nullable Output<String> resourceShareArn) {
        this.principal = principal;
        this.resourceShareArn = resourceShareArn;
    }

    private PrincipalAssociationState() {
        this.principal = Output.empty();
        this.resourceShareArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrincipalAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> principal;
        private @Nullable Output<String> resourceShareArn;

        public Builder() {
    	      // Empty
        }

        public Builder(PrincipalAssociationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principal = defaults.principal;
    	      this.resourceShareArn = defaults.resourceShareArn;
        }

        public Builder principal(@Nullable Output<String> principal) {
            this.principal = principal;
            return this;
        }
        public Builder principal(@Nullable String principal) {
            this.principal = Output.ofNullable(principal);
            return this;
        }
        public Builder resourceShareArn(@Nullable Output<String> resourceShareArn) {
            this.resourceShareArn = resourceShareArn;
            return this;
        }
        public Builder resourceShareArn(@Nullable String resourceShareArn) {
            this.resourceShareArn = Output.ofNullable(resourceShareArn);
            return this;
        }        public PrincipalAssociationState build() {
            return new PrincipalAssociationState(principal, resourceShareArn);
        }
    }
}