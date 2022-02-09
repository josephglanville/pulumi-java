// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.inputs;

import io.pulumi.azurenative.labservices.enums.AddRemove;
import io.pulumi.core.Either;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGlobalUserPersonalPreferencesArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetGlobalUserPersonalPreferencesArgs Empty = new GetGlobalUserPersonalPreferencesArgs();

    @InputImport(name="addRemove")
    private final @Nullable Either<String,AddRemove> addRemove;

    public Either<String,AddRemove> getAddRemove() {
        return this.addRemove == null ? null : this.addRemove;
    }

    @InputImport(name="labAccountResourceId")
    private final @Nullable String labAccountResourceId;

    public Optional<String> getLabAccountResourceId() {
        return this.labAccountResourceId == null ? Optional.empty() : Optional.ofNullable(this.labAccountResourceId);
    }

    @InputImport(name="labResourceId")
    private final @Nullable String labResourceId;

    public Optional<String> getLabResourceId() {
        return this.labResourceId == null ? Optional.empty() : Optional.ofNullable(this.labResourceId);
    }

    @InputImport(name="userName", required=true)
    private final String userName;

    public String getUserName() {
        return this.userName;
    }

    public GetGlobalUserPersonalPreferencesArgs(
        @Nullable Either<String,AddRemove> addRemove,
        @Nullable String labAccountResourceId,
        @Nullable String labResourceId,
        String userName) {
        this.addRemove = addRemove;
        this.labAccountResourceId = labAccountResourceId;
        this.labResourceId = labResourceId;
        this.userName = Objects.requireNonNull(userName, "expected parameter 'userName' to be non-null");
    }

    private GetGlobalUserPersonalPreferencesArgs() {
        this.addRemove = null;
        this.labAccountResourceId = null;
        this.labResourceId = null;
        this.userName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalUserPersonalPreferencesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Either<String,AddRemove> addRemove;
        private @Nullable String labAccountResourceId;
        private @Nullable String labResourceId;
        private String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGlobalUserPersonalPreferencesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addRemove = defaults.addRemove;
    	      this.labAccountResourceId = defaults.labAccountResourceId;
    	      this.labResourceId = defaults.labResourceId;
    	      this.userName = defaults.userName;
        }

        public Builder setAddRemove(@Nullable Either<String,AddRemove> addRemove) {
            this.addRemove = addRemove;
            return this;
        }

        public Builder setLabAccountResourceId(@Nullable String labAccountResourceId) {
            this.labAccountResourceId = labAccountResourceId;
            return this;
        }

        public Builder setLabResourceId(@Nullable String labResourceId) {
            this.labResourceId = labResourceId;
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }

        public GetGlobalUserPersonalPreferencesArgs build() {
            return new GetGlobalUserPersonalPreferencesArgs(addRemove, labAccountResourceId, labResourceId, userName);
        }
    }
}
