// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.saas.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListSaasSubscriptionLevelAccessTokenResult {
    private final @Nullable String publisherOfferBaseUri;
    private final @Nullable String token;

    @OutputCustomType.Constructor({"publisherOfferBaseUri","token"})
    private ListSaasSubscriptionLevelAccessTokenResult(
        @Nullable String publisherOfferBaseUri,
        @Nullable String token) {
        this.publisherOfferBaseUri = publisherOfferBaseUri;
        this.token = token;
    }

    public Optional<String> getPublisherOfferBaseUri() {
        return Optional.ofNullable(this.publisherOfferBaseUri);
    }
    public Optional<String> getToken() {
        return Optional.ofNullable(this.token);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListSaasSubscriptionLevelAccessTokenResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String publisherOfferBaseUri;
        private @Nullable String token;

        public Builder() {
    	      // Empty
        }

        public Builder(ListSaasSubscriptionLevelAccessTokenResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publisherOfferBaseUri = defaults.publisherOfferBaseUri;
    	      this.token = defaults.token;
        }

        public Builder setPublisherOfferBaseUri(@Nullable String publisherOfferBaseUri) {
            this.publisherOfferBaseUri = publisherOfferBaseUri;
            return this;
        }

        public Builder setToken(@Nullable String token) {
            this.token = token;
            return this;
        }

        public ListSaasSubscriptionLevelAccessTokenResult build() {
            return new ListSaasSubscriptionLevelAccessTokenResult(publisherOfferBaseUri, token);
        }
    }
}
