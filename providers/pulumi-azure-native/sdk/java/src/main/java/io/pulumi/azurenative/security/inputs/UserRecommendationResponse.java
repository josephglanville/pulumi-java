// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserRecommendationResponse extends io.pulumi.resources.InvokeArgs {

    public static final UserRecommendationResponse Empty = new UserRecommendationResponse();

    @InputImport(name="recommendationAction")
    private final @Nullable String recommendationAction;

    public Optional<String> getRecommendationAction() {
        return this.recommendationAction == null ? Optional.empty() : Optional.ofNullable(this.recommendationAction);
    }

    @InputImport(name="username")
    private final @Nullable String username;

    public Optional<String> getUsername() {
        return this.username == null ? Optional.empty() : Optional.ofNullable(this.username);
    }

    public UserRecommendationResponse(
        @Nullable String recommendationAction,
        @Nullable String username) {
        this.recommendationAction = recommendationAction;
        this.username = username;
    }

    private UserRecommendationResponse() {
        this.recommendationAction = null;
        this.username = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserRecommendationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String recommendationAction;
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(UserRecommendationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recommendationAction = defaults.recommendationAction;
    	      this.username = defaults.username;
        }

        public Builder setRecommendationAction(@Nullable String recommendationAction) {
            this.recommendationAction = recommendationAction;
            return this;
        }

        public Builder setUsername(@Nullable String username) {
            this.username = username;
            return this;
        }

        public UserRecommendationResponse build() {
            return new UserRecommendationResponse(recommendationAction, username);
        }
    }
}
