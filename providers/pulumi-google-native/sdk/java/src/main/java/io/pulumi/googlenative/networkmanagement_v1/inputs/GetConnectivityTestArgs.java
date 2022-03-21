// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkmanagement_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConnectivityTestArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetConnectivityTestArgs Empty = new GetConnectivityTestArgs();

    @Import(name="connectivityTestId", required=true)
      private final String connectivityTestId;

    public String getConnectivityTestId() {
        return this.connectivityTestId;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetConnectivityTestArgs(
        String connectivityTestId,
        @Nullable String project) {
        this.connectivityTestId = Objects.requireNonNull(connectivityTestId, "expected parameter 'connectivityTestId' to be non-null");
        this.project = project;
    }

    private GetConnectivityTestArgs() {
        this.connectivityTestId = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectivityTestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String connectivityTestId;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConnectivityTestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectivityTestId = defaults.connectivityTestId;
    	      this.project = defaults.project;
        }

        public Builder connectivityTestId(String connectivityTestId) {
            this.connectivityTestId = Objects.requireNonNull(connectivityTestId);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }        public GetConnectivityTestArgs build() {
            return new GetConnectivityTestArgs(connectivityTestId, project);
        }
    }
}
