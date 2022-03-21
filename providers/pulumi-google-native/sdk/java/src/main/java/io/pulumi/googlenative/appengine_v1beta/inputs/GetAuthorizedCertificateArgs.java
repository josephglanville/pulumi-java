// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAuthorizedCertificateArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAuthorizedCertificateArgs Empty = new GetAuthorizedCertificateArgs();

    @Import(name="appId", required=true)
      private final String appId;

    public String getAppId() {
        return this.appId;
    }

    @Import(name="authorizedCertificateId", required=true)
      private final String authorizedCertificateId;

    public String getAuthorizedCertificateId() {
        return this.authorizedCertificateId;
    }

    @Import(name="view")
      private final @Nullable String view;

    public Optional<String> getView() {
        return this.view == null ? Optional.empty() : Optional.ofNullable(this.view);
    }

    public GetAuthorizedCertificateArgs(
        String appId,
        String authorizedCertificateId,
        @Nullable String view) {
        this.appId = Objects.requireNonNull(appId, "expected parameter 'appId' to be non-null");
        this.authorizedCertificateId = Objects.requireNonNull(authorizedCertificateId, "expected parameter 'authorizedCertificateId' to be non-null");
        this.view = view;
    }

    private GetAuthorizedCertificateArgs() {
        this.appId = null;
        this.authorizedCertificateId = null;
        this.view = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAuthorizedCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appId;
        private String authorizedCertificateId;
        private @Nullable String view;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAuthorizedCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.authorizedCertificateId = defaults.authorizedCertificateId;
    	      this.view = defaults.view;
        }

        public Builder appId(String appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }
        public Builder authorizedCertificateId(String authorizedCertificateId) {
            this.authorizedCertificateId = Objects.requireNonNull(authorizedCertificateId);
            return this;
        }
        public Builder view(@Nullable String view) {
            this.view = view;
            return this;
        }        public GetAuthorizedCertificateArgs build() {
            return new GetAuthorizedCertificateArgs(appId, authorizedCertificateId, view);
        }
    }
}
