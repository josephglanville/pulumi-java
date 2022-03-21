// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appsync.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDomainNameApiAssociationResult {
    private final @Nullable String apiAssociationIdentifier;
    private final @Nullable String apiId;

    @CustomType.Constructor
    private GetDomainNameApiAssociationResult(
        @CustomType.Parameter("apiAssociationIdentifier") @Nullable String apiAssociationIdentifier,
        @CustomType.Parameter("apiId") @Nullable String apiId) {
        this.apiAssociationIdentifier = apiAssociationIdentifier;
        this.apiId = apiId;
    }

    public Optional<String> getApiAssociationIdentifier() {
        return Optional.ofNullable(this.apiAssociationIdentifier);
    }
    public Optional<String> getApiId() {
        return Optional.ofNullable(this.apiId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainNameApiAssociationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apiAssociationIdentifier;
        private @Nullable String apiId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainNameApiAssociationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiAssociationIdentifier = defaults.apiAssociationIdentifier;
    	      this.apiId = defaults.apiId;
        }

        public Builder apiAssociationIdentifier(@Nullable String apiAssociationIdentifier) {
            this.apiAssociationIdentifier = apiAssociationIdentifier;
            return this;
        }
        public Builder apiId(@Nullable String apiId) {
            this.apiId = apiId;
            return this;
        }        public GetDomainNameApiAssociationResult build() {
            return new GetDomainNameApiAssociationResult(apiAssociationIdentifier, apiId);
        }
    }
}
