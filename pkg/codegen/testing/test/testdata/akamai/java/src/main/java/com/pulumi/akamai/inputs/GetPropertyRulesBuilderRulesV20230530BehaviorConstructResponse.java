// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530BehaviorConstructResponse extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorConstructResponse Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorConstructResponse();

    @Import(name="body")
    private @Nullable String body;

    public Optional<String> body() {
        return Optional.ofNullable(this.body);
    }

    @Import(name="enabled")
    private @Nullable Boolean enabled;

    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="forceEviction")
    private @Nullable Boolean forceEviction;

    public Optional<Boolean> forceEviction() {
        return Optional.ofNullable(this.forceEviction);
    }

    @Import(name="ignorePurge")
    private @Nullable Boolean ignorePurge;

    public Optional<Boolean> ignorePurge() {
        return Optional.ofNullable(this.ignorePurge);
    }

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="responseCode")
    private @Nullable Integer responseCode;

    public Optional<Integer> responseCode() {
        return Optional.ofNullable(this.responseCode);
    }

    @Import(name="templateUuid")
    private @Nullable String templateUuid;

    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="uuid")
    private @Nullable String uuid;

    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private GetPropertyRulesBuilderRulesV20230530BehaviorConstructResponse() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorConstructResponse(GetPropertyRulesBuilderRulesV20230530BehaviorConstructResponse $) {
        this.body = $.body;
        this.enabled = $.enabled;
        this.forceEviction = $.forceEviction;
        this.ignorePurge = $.ignorePurge;
        this.locked = $.locked;
        this.responseCode = $.responseCode;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorConstructResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorConstructResponse $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorConstructResponse();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorConstructResponse defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorConstructResponse(Objects.requireNonNull(defaults));
        }

        public Builder body(@Nullable String body) {
            $.body = body;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder forceEviction(@Nullable Boolean forceEviction) {
            $.forceEviction = forceEviction;
            return this;
        }

        public Builder ignorePurge(@Nullable Boolean ignorePurge) {
            $.ignorePurge = ignorePurge;
            return this;
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder responseCode(@Nullable Integer responseCode) {
            $.responseCode = responseCode;
            return this;
        }

        public Builder templateUuid(@Nullable String templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder uuid(@Nullable String uuid) {
            $.uuid = uuid;
            return this;
        }

        public GetPropertyRulesBuilderRulesV20230530BehaviorConstructResponse build() {
            return $;
        }
    }

}
