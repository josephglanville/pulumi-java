// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.redhatopenshift.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class APIServerProfileResponse {
    private final @Nullable String ip;
    private final @Nullable String url;
    private final @Nullable String visibility;

    @OutputCustomType.Constructor({"ip","url","visibility"})
    private APIServerProfileResponse(
        @Nullable String ip,
        @Nullable String url,
        @Nullable String visibility) {
        this.ip = ip;
        this.url = url;
        this.visibility = visibility;
    }

    public Optional<String> getIp() {
        return Optional.ofNullable(this.ip);
    }
    public Optional<String> getUrl() {
        return Optional.ofNullable(this.url);
    }
    public Optional<String> getVisibility() {
        return Optional.ofNullable(this.visibility);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(APIServerProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ip;
        private @Nullable String url;
        private @Nullable String visibility;

        public Builder() {
    	      // Empty
        }

        public Builder(APIServerProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ip = defaults.ip;
    	      this.url = defaults.url;
    	      this.visibility = defaults.visibility;
        }

        public Builder setIp(@Nullable String ip) {
            this.ip = ip;
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = url;
            return this;
        }

        public Builder setVisibility(@Nullable String visibility) {
            this.visibility = visibility;
            return this;
        }

        public APIServerProfileResponse build() {
            return new APIServerProfileResponse(ip, url, visibility);
        }
    }
}
