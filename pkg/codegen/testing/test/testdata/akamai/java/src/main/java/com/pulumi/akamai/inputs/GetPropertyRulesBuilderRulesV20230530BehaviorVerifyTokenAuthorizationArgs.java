// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530BehaviorVerifyTokenAuthorizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorVerifyTokenAuthorizationArgs Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorVerifyTokenAuthorizationArgs();

    @Import(name="algorithm")
    private @Nullable Output<String> algorithm;

    public Optional<Output<String>> algorithm() {
        return Optional.ofNullable(this.algorithm);
    }

    @Import(name="escapeHmacInputs")
    private @Nullable Output<Boolean> escapeHmacInputs;

    public Optional<Output<Boolean>> escapeHmacInputs() {
        return Optional.ofNullable(this.escapeHmacInputs);
    }

    @Import(name="failureResponse")
    private @Nullable Output<Boolean> failureResponse;

    public Optional<Output<Boolean>> failureResponse() {
        return Optional.ofNullable(this.failureResponse);
    }

    @Import(name="ignoreQueryString")
    private @Nullable Output<Boolean> ignoreQueryString;

    public Optional<Output<Boolean>> ignoreQueryString() {
        return Optional.ofNullable(this.ignoreQueryString);
    }

    @Import(name="key")
    private @Nullable Output<String> key;

    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    @Import(name="locationId")
    private @Nullable Output<String> locationId;

    public Optional<Output<String>> locationId() {
        return Optional.ofNullable(this.locationId);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="salt")
    private @Nullable Output<String> salt;

    public Optional<Output<String>> salt() {
        return Optional.ofNullable(this.salt);
    }

    @Import(name="templateUuid")
    private @Nullable Output<String> templateUuid;

    public Optional<Output<String>> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="transitionKey")
    private @Nullable Output<String> transitionKey;

    public Optional<Output<String>> transitionKey() {
        return Optional.ofNullable(this.transitionKey);
    }

    @Import(name="useAdvanced")
    private @Nullable Output<Boolean> useAdvanced;

    public Optional<Output<Boolean>> useAdvanced() {
        return Optional.ofNullable(this.useAdvanced);
    }

    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private GetPropertyRulesBuilderRulesV20230530BehaviorVerifyTokenAuthorizationArgs() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorVerifyTokenAuthorizationArgs(GetPropertyRulesBuilderRulesV20230530BehaviorVerifyTokenAuthorizationArgs $) {
        this.algorithm = $.algorithm;
        this.escapeHmacInputs = $.escapeHmacInputs;
        this.failureResponse = $.failureResponse;
        this.ignoreQueryString = $.ignoreQueryString;
        this.key = $.key;
        this.location = $.location;
        this.locationId = $.locationId;
        this.locked = $.locked;
        this.salt = $.salt;
        this.templateUuid = $.templateUuid;
        this.transitionKey = $.transitionKey;
        this.useAdvanced = $.useAdvanced;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorVerifyTokenAuthorizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorVerifyTokenAuthorizationArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorVerifyTokenAuthorizationArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorVerifyTokenAuthorizationArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorVerifyTokenAuthorizationArgs(Objects.requireNonNull(defaults));
        }

        public Builder algorithm(@Nullable Output<String> algorithm) {
            $.algorithm = algorithm;
            return this;
        }

        public Builder algorithm(String algorithm) {
            return algorithm(Output.of(algorithm));
        }

        public Builder escapeHmacInputs(@Nullable Output<Boolean> escapeHmacInputs) {
            $.escapeHmacInputs = escapeHmacInputs;
            return this;
        }

        public Builder escapeHmacInputs(Boolean escapeHmacInputs) {
            return escapeHmacInputs(Output.of(escapeHmacInputs));
        }

        public Builder failureResponse(@Nullable Output<Boolean> failureResponse) {
            $.failureResponse = failureResponse;
            return this;
        }

        public Builder failureResponse(Boolean failureResponse) {
            return failureResponse(Output.of(failureResponse));
        }

        public Builder ignoreQueryString(@Nullable Output<Boolean> ignoreQueryString) {
            $.ignoreQueryString = ignoreQueryString;
            return this;
        }

        public Builder ignoreQueryString(Boolean ignoreQueryString) {
            return ignoreQueryString(Output.of(ignoreQueryString));
        }

        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder locationId(@Nullable Output<String> locationId) {
            $.locationId = locationId;
            return this;
        }

        public Builder locationId(String locationId) {
            return locationId(Output.of(locationId));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder salt(@Nullable Output<String> salt) {
            $.salt = salt;
            return this;
        }

        public Builder salt(String salt) {
            return salt(Output.of(salt));
        }

        public Builder templateUuid(@Nullable Output<String> templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder templateUuid(String templateUuid) {
            return templateUuid(Output.of(templateUuid));
        }

        public Builder transitionKey(@Nullable Output<String> transitionKey) {
            $.transitionKey = transitionKey;
            return this;
        }

        public Builder transitionKey(String transitionKey) {
            return transitionKey(Output.of(transitionKey));
        }

        public Builder useAdvanced(@Nullable Output<Boolean> useAdvanced) {
            $.useAdvanced = useAdvanced;
            return this;
        }

        public Builder useAdvanced(Boolean useAdvanced) {
            return useAdvanced(Output.of(useAdvanced));
        }

        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public GetPropertyRulesBuilderRulesV20230530BehaviorVerifyTokenAuthorizationArgs build() {
            return $;
        }
    }

}
