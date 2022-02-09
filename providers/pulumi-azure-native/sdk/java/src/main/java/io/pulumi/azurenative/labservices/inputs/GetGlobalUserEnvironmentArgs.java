// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGlobalUserEnvironmentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetGlobalUserEnvironmentArgs Empty = new GetGlobalUserEnvironmentArgs();

    @InputImport(name="environmentId", required=true)
    private final String environmentId;

    public String getEnvironmentId() {
        return this.environmentId;
    }

    @InputImport(name="expand")
    private final @Nullable String expand;

    public Optional<String> getExpand() {
        return this.expand == null ? Optional.empty() : Optional.ofNullable(this.expand);
    }

    @InputImport(name="userName", required=true)
    private final String userName;

    public String getUserName() {
        return this.userName;
    }

    public GetGlobalUserEnvironmentArgs(
        String environmentId,
        @Nullable String expand,
        String userName) {
        this.environmentId = Objects.requireNonNull(environmentId, "expected parameter 'environmentId' to be non-null");
        this.expand = expand;
        this.userName = Objects.requireNonNull(userName, "expected parameter 'userName' to be non-null");
    }

    private GetGlobalUserEnvironmentArgs() {
        this.environmentId = null;
        this.expand = null;
        this.userName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalUserEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String environmentId;
        private @Nullable String expand;
        private String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGlobalUserEnvironmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environmentId = defaults.environmentId;
    	      this.expand = defaults.expand;
    	      this.userName = defaults.userName;
        }

        public Builder setEnvironmentId(String environmentId) {
            this.environmentId = Objects.requireNonNull(environmentId);
            return this;
        }

        public Builder setExpand(@Nullable String expand) {
            this.expand = expand;
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }

        public GetGlobalUserEnvironmentArgs build() {
            return new GetGlobalUserEnvironmentArgs(environmentId, expand, userName);
        }
    }
}
