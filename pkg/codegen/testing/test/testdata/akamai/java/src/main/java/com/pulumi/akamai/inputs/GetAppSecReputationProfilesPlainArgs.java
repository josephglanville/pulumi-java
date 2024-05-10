// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAppSecReputationProfilesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppSecReputationProfilesPlainArgs Empty = new GetAppSecReputationProfilesPlainArgs();

    @Import(name="configId", required=true)
    private Integer configId;

    public Integer configId() {
        return this.configId;
    }

    @Import(name="reputationProfileId")
    private @Nullable Integer reputationProfileId;

    public Optional<Integer> reputationProfileId() {
        return Optional.ofNullable(this.reputationProfileId);
    }

    private GetAppSecReputationProfilesPlainArgs() {}

    private GetAppSecReputationProfilesPlainArgs(GetAppSecReputationProfilesPlainArgs $) {
        this.configId = $.configId;
        this.reputationProfileId = $.reputationProfileId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppSecReputationProfilesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppSecReputationProfilesPlainArgs $;

        public Builder() {
            $ = new GetAppSecReputationProfilesPlainArgs();
        }

        public Builder(GetAppSecReputationProfilesPlainArgs defaults) {
            $ = new GetAppSecReputationProfilesPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder configId(Integer configId) {
            $.configId = configId;
            return this;
        }

        public Builder reputationProfileId(@Nullable Integer reputationProfileId) {
            $.reputationProfileId = reputationProfileId;
            return this;
        }

        public GetAppSecReputationProfilesPlainArgs build() {
            if ($.configId == null) {
                throw new MissingRequiredPropertyException("GetAppSecReputationProfilesPlainArgs", "configId");
            }
            return $;
        }
    }

}
