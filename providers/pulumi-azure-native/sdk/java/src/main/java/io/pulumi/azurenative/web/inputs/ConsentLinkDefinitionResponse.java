// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConsentLinkDefinitionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConsentLinkDefinitionResponse Empty = new ConsentLinkDefinitionResponse();

    @InputImport(name="displayName")
    private final @Nullable String displayName;

    public Optional<String> getDisplayName() {
        return this.displayName == null ? Optional.empty() : Optional.ofNullable(this.displayName);
    }

    @InputImport(name="firstPartyLoginUri")
    private final @Nullable String firstPartyLoginUri;

    public Optional<String> getFirstPartyLoginUri() {
        return this.firstPartyLoginUri == null ? Optional.empty() : Optional.ofNullable(this.firstPartyLoginUri);
    }

    @InputImport(name="link")
    private final @Nullable String link;

    public Optional<String> getLink() {
        return this.link == null ? Optional.empty() : Optional.ofNullable(this.link);
    }

    @InputImport(name="status")
    private final @Nullable String status;

    public Optional<String> getStatus() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    public ConsentLinkDefinitionResponse(
        @Nullable String displayName,
        @Nullable String firstPartyLoginUri,
        @Nullable String link,
        @Nullable String status) {
        this.displayName = displayName;
        this.firstPartyLoginUri = firstPartyLoginUri;
        this.link = link;
        this.status = status;
    }

    private ConsentLinkDefinitionResponse() {
        this.displayName = null;
        this.firstPartyLoginUri = null;
        this.link = null;
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConsentLinkDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String displayName;
        private @Nullable String firstPartyLoginUri;
        private @Nullable String link;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(ConsentLinkDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.firstPartyLoginUri = defaults.firstPartyLoginUri;
    	      this.link = defaults.link;
    	      this.status = defaults.status;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setFirstPartyLoginUri(@Nullable String firstPartyLoginUri) {
            this.firstPartyLoginUri = firstPartyLoginUri;
            return this;
        }

        public Builder setLink(@Nullable String link) {
            this.link = link;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public ConsentLinkDefinitionResponse build() {
            return new ConsentLinkDefinitionResponse(displayName, firstPartyLoginUri, link, status);
        }
    }
}
