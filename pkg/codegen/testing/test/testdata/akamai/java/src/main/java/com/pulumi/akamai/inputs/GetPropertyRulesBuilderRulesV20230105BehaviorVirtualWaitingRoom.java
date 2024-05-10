// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105BehaviorVirtualWaitingRoom extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorVirtualWaitingRoom Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorVirtualWaitingRoom();

    @Import(name="accessTitle")
    private @Nullable String accessTitle;

    public Optional<String> accessTitle() {
        return Optional.ofNullable(this.accessTitle);
    }

    @Import(name="cloudletSharedPolicy")
    private @Nullable Integer cloudletSharedPolicy;

    public Optional<Integer> cloudletSharedPolicy() {
        return Optional.ofNullable(this.cloudletSharedPolicy);
    }

    @Import(name="customCookieDomain")
    private @Nullable String customCookieDomain;

    public Optional<String> customCookieDomain() {
        return Optional.ofNullable(this.customCookieDomain);
    }

    @Import(name="domainConfig")
    private @Nullable String domainConfig;

    public Optional<String> domainConfig() {
        return Optional.ofNullable(this.domainConfig);
    }

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="sessionAutoProlong")
    private @Nullable Boolean sessionAutoProlong;

    public Optional<Boolean> sessionAutoProlong() {
        return Optional.ofNullable(this.sessionAutoProlong);
    }

    @Import(name="sessionDuration")
    private @Nullable Integer sessionDuration;

    public Optional<Integer> sessionDuration() {
        return Optional.ofNullable(this.sessionDuration);
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

    @Import(name="waitingRoomAssetsPaths")
    private @Nullable List<String> waitingRoomAssetsPaths;

    public Optional<List<String>> waitingRoomAssetsPaths() {
        return Optional.ofNullable(this.waitingRoomAssetsPaths);
    }

    @Import(name="waitingRoomPath")
    private @Nullable String waitingRoomPath;

    public Optional<String> waitingRoomPath() {
        return Optional.ofNullable(this.waitingRoomPath);
    }

    @Import(name="waitingRoomTitle")
    private @Nullable String waitingRoomTitle;

    public Optional<String> waitingRoomTitle() {
        return Optional.ofNullable(this.waitingRoomTitle);
    }

    private GetPropertyRulesBuilderRulesV20230105BehaviorVirtualWaitingRoom() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorVirtualWaitingRoom(GetPropertyRulesBuilderRulesV20230105BehaviorVirtualWaitingRoom $) {
        this.accessTitle = $.accessTitle;
        this.cloudletSharedPolicy = $.cloudletSharedPolicy;
        this.customCookieDomain = $.customCookieDomain;
        this.domainConfig = $.domainConfig;
        this.locked = $.locked;
        this.sessionAutoProlong = $.sessionAutoProlong;
        this.sessionDuration = $.sessionDuration;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
        this.waitingRoomAssetsPaths = $.waitingRoomAssetsPaths;
        this.waitingRoomPath = $.waitingRoomPath;
        this.waitingRoomTitle = $.waitingRoomTitle;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorVirtualWaitingRoom defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorVirtualWaitingRoom $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorVirtualWaitingRoom();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorVirtualWaitingRoom defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorVirtualWaitingRoom(Objects.requireNonNull(defaults));
        }

        public Builder accessTitle(@Nullable String accessTitle) {
            $.accessTitle = accessTitle;
            return this;
        }

        public Builder cloudletSharedPolicy(@Nullable Integer cloudletSharedPolicy) {
            $.cloudletSharedPolicy = cloudletSharedPolicy;
            return this;
        }

        public Builder customCookieDomain(@Nullable String customCookieDomain) {
            $.customCookieDomain = customCookieDomain;
            return this;
        }

        public Builder domainConfig(@Nullable String domainConfig) {
            $.domainConfig = domainConfig;
            return this;
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder sessionAutoProlong(@Nullable Boolean sessionAutoProlong) {
            $.sessionAutoProlong = sessionAutoProlong;
            return this;
        }

        public Builder sessionDuration(@Nullable Integer sessionDuration) {
            $.sessionDuration = sessionDuration;
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

        public Builder waitingRoomAssetsPaths(@Nullable List<String> waitingRoomAssetsPaths) {
            $.waitingRoomAssetsPaths = waitingRoomAssetsPaths;
            return this;
        }

        public Builder waitingRoomAssetsPaths(String... waitingRoomAssetsPaths) {
            return waitingRoomAssetsPaths(List.of(waitingRoomAssetsPaths));
        }

        public Builder waitingRoomPath(@Nullable String waitingRoomPath) {
            $.waitingRoomPath = waitingRoomPath;
            return this;
        }

        public Builder waitingRoomTitle(@Nullable String waitingRoomTitle) {
            $.waitingRoomTitle = waitingRoomTitle;
            return this;
        }

        public GetPropertyRulesBuilderRulesV20230105BehaviorVirtualWaitingRoom build() {
            return $;
        }
    }

}
