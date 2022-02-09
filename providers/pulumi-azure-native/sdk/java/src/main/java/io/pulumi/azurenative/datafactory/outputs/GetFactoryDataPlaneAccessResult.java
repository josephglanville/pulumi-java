// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.UserAccessPolicyResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetFactoryDataPlaneAccessResult {
    private final @Nullable String accessToken;
    private final @Nullable String dataPlaneUrl;
    private final @Nullable UserAccessPolicyResponse policy;

    @OutputCustomType.Constructor({"accessToken","dataPlaneUrl","policy"})
    private GetFactoryDataPlaneAccessResult(
        @Nullable String accessToken,
        @Nullable String dataPlaneUrl,
        @Nullable UserAccessPolicyResponse policy) {
        this.accessToken = accessToken;
        this.dataPlaneUrl = dataPlaneUrl;
        this.policy = policy;
    }

    public Optional<String> getAccessToken() {
        return Optional.ofNullable(this.accessToken);
    }
    public Optional<String> getDataPlaneUrl() {
        return Optional.ofNullable(this.dataPlaneUrl);
    }
    public Optional<UserAccessPolicyResponse> getPolicy() {
        return Optional.ofNullable(this.policy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFactoryDataPlaneAccessResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessToken;
        private @Nullable String dataPlaneUrl;
        private @Nullable UserAccessPolicyResponse policy;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFactoryDataPlaneAccessResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.dataPlaneUrl = defaults.dataPlaneUrl;
    	      this.policy = defaults.policy;
        }

        public Builder setAccessToken(@Nullable String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        public Builder setDataPlaneUrl(@Nullable String dataPlaneUrl) {
            this.dataPlaneUrl = dataPlaneUrl;
            return this;
        }

        public Builder setPolicy(@Nullable UserAccessPolicyResponse policy) {
            this.policy = policy;
            return this;
        }

        public GetFactoryDataPlaneAccessResult build() {
            return new GetFactoryDataPlaneAccessResult(accessToken, dataPlaneUrl, policy);
        }
    }
}
