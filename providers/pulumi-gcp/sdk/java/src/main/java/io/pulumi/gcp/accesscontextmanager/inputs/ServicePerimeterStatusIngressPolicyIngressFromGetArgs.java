// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressFromSourceGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimeterStatusIngressPolicyIngressFromGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimeterStatusIngressPolicyIngressFromGetArgs Empty = new ServicePerimeterStatusIngressPolicyIngressFromGetArgs();

    /**
     * A list of identities that are allowed access through this `EgressPolicy`.
     * Should be in the format of email address. The email address should
     * represent individual user or service account only.
     * 
     */
    @Import(name="identities")
      private final @Nullable Output<List<String>> identities;

    public Output<List<String>> getIdentities() {
        return this.identities == null ? Output.empty() : this.identities;
    }

    /**
     * Specifies the type of identities that are allowed access to outside the
     * perimeter. If left unspecified, then members of `identities` field will
     * be allowed access.
     * Possible values are `IDENTITY_TYPE_UNSPECIFIED`, `ANY_IDENTITY`, `ANY_USER_ACCOUNT`, and `ANY_SERVICE_ACCOUNT`.
     * 
     */
    @Import(name="identityType")
      private final @Nullable Output<String> identityType;

    public Output<String> getIdentityType() {
        return this.identityType == null ? Output.empty() : this.identityType;
    }

    /**
     * Sources that this `IngressPolicy` authorizes access from.
     * Structure is documented below.
     * 
     */
    @Import(name="sources")
      private final @Nullable Output<List<ServicePerimeterStatusIngressPolicyIngressFromSourceGetArgs>> sources;

    public Output<List<ServicePerimeterStatusIngressPolicyIngressFromSourceGetArgs>> getSources() {
        return this.sources == null ? Output.empty() : this.sources;
    }

    public ServicePerimeterStatusIngressPolicyIngressFromGetArgs(
        @Nullable Output<List<String>> identities,
        @Nullable Output<String> identityType,
        @Nullable Output<List<ServicePerimeterStatusIngressPolicyIngressFromSourceGetArgs>> sources) {
        this.identities = identities;
        this.identityType = identityType;
        this.sources = sources;
    }

    private ServicePerimeterStatusIngressPolicyIngressFromGetArgs() {
        this.identities = Output.empty();
        this.identityType = Output.empty();
        this.sources = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimeterStatusIngressPolicyIngressFromGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> identities;
        private @Nullable Output<String> identityType;
        private @Nullable Output<List<ServicePerimeterStatusIngressPolicyIngressFromSourceGetArgs>> sources;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimeterStatusIngressPolicyIngressFromGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identities = defaults.identities;
    	      this.identityType = defaults.identityType;
    	      this.sources = defaults.sources;
        }

        public Builder identities(@Nullable Output<List<String>> identities) {
            this.identities = identities;
            return this;
        }
        public Builder identities(@Nullable List<String> identities) {
            this.identities = Output.ofNullable(identities);
            return this;
        }
        public Builder identities(String... identities) {
            return identities(List.of(identities));
        }
        public Builder identityType(@Nullable Output<String> identityType) {
            this.identityType = identityType;
            return this;
        }
        public Builder identityType(@Nullable String identityType) {
            this.identityType = Output.ofNullable(identityType);
            return this;
        }
        public Builder sources(@Nullable Output<List<ServicePerimeterStatusIngressPolicyIngressFromSourceGetArgs>> sources) {
            this.sources = sources;
            return this;
        }
        public Builder sources(@Nullable List<ServicePerimeterStatusIngressPolicyIngressFromSourceGetArgs> sources) {
            this.sources = Output.ofNullable(sources);
            return this;
        }
        public Builder sources(ServicePerimeterStatusIngressPolicyIngressFromSourceGetArgs... sources) {
            return sources(List.of(sources));
        }        public ServicePerimeterStatusIngressPolicyIngressFromGetArgs build() {
            return new ServicePerimeterStatusIngressPolicyIngressFromGetArgs(identities, identityType, sources);
        }
    }
}
