// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeOriginal;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeTransformed;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideo extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideo Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideo();

    @Import(name="advanced")
    private @Nullable Boolean advanced;

    public Optional<Boolean> advanced() {
        return Optional.ofNullable(this.advanced);
    }

    @Import(name="apiReferenceTitle")
    private @Nullable String apiReferenceTitle;

    public Optional<String> apiReferenceTitle() {
        return Optional.ofNullable(this.apiReferenceTitle);
    }

    @Import(name="applyBestFileType")
    private @Nullable Boolean applyBestFileType;

    public Optional<Boolean> applyBestFileType() {
        return Optional.ofNullable(this.applyBestFileType);
    }

    @Import(name="cpCodeOriginal")
    private @Nullable GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeOriginal cpCodeOriginal;

    public Optional<GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeOriginal> cpCodeOriginal() {
        return Optional.ofNullable(this.cpCodeOriginal);
    }

    @Import(name="cpCodeTransformed")
    private @Nullable GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeTransformed cpCodeTransformed;

    public Optional<GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeTransformed> cpCodeTransformed() {
        return Optional.ofNullable(this.cpCodeTransformed);
    }

    @Import(name="enabled")
    private @Nullable Boolean enabled;

    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="policySet")
    private @Nullable String policySet;

    public Optional<String> policySet() {
        return Optional.ofNullable(this.policySet);
    }

    @Import(name="policyToken")
    private @Nullable String policyToken;

    public Optional<String> policyToken() {
        return Optional.ofNullable(this.policyToken);
    }

    @Import(name="policyTokenDefault")
    private @Nullable String policyTokenDefault;

    public Optional<String> policyTokenDefault() {
        return Optional.ofNullable(this.policyTokenDefault);
    }

    @Import(name="resize")
    private @Nullable Boolean resize;

    public Optional<Boolean> resize() {
        return Optional.ofNullable(this.resize);
    }

    @Import(name="settingsTitle")
    private @Nullable String settingsTitle;

    public Optional<String> settingsTitle() {
        return Optional.ofNullable(this.settingsTitle);
    }

    @Import(name="superCacheRegion")
    private @Nullable String superCacheRegion;

    public Optional<String> superCacheRegion() {
        return Optional.ofNullable(this.superCacheRegion);
    }

    @Import(name="templateUuid")
    private @Nullable String templateUuid;

    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="trafficTitle")
    private @Nullable String trafficTitle;

    public Optional<String> trafficTitle() {
        return Optional.ofNullable(this.trafficTitle);
    }

    @Import(name="useExistingPolicySet")
    private @Nullable Boolean useExistingPolicySet;

    public Optional<Boolean> useExistingPolicySet() {
        return Optional.ofNullable(this.useExistingPolicySet);
    }

    @Import(name="uuid")
    private @Nullable String uuid;

    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideo() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideo(GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideo $) {
        this.advanced = $.advanced;
        this.apiReferenceTitle = $.apiReferenceTitle;
        this.applyBestFileType = $.applyBestFileType;
        this.cpCodeOriginal = $.cpCodeOriginal;
        this.cpCodeTransformed = $.cpCodeTransformed;
        this.enabled = $.enabled;
        this.locked = $.locked;
        this.policySet = $.policySet;
        this.policyToken = $.policyToken;
        this.policyTokenDefault = $.policyTokenDefault;
        this.resize = $.resize;
        this.settingsTitle = $.settingsTitle;
        this.superCacheRegion = $.superCacheRegion;
        this.templateUuid = $.templateUuid;
        this.trafficTitle = $.trafficTitle;
        this.useExistingPolicySet = $.useExistingPolicySet;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideo $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideo();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideo defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideo(Objects.requireNonNull(defaults));
        }

        public Builder advanced(@Nullable Boolean advanced) {
            $.advanced = advanced;
            return this;
        }

        public Builder apiReferenceTitle(@Nullable String apiReferenceTitle) {
            $.apiReferenceTitle = apiReferenceTitle;
            return this;
        }

        public Builder applyBestFileType(@Nullable Boolean applyBestFileType) {
            $.applyBestFileType = applyBestFileType;
            return this;
        }

        public Builder cpCodeOriginal(@Nullable GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeOriginal cpCodeOriginal) {
            $.cpCodeOriginal = cpCodeOriginal;
            return this;
        }

        public Builder cpCodeTransformed(@Nullable GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeTransformed cpCodeTransformed) {
            $.cpCodeTransformed = cpCodeTransformed;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder policySet(@Nullable String policySet) {
            $.policySet = policySet;
            return this;
        }

        public Builder policyToken(@Nullable String policyToken) {
            $.policyToken = policyToken;
            return this;
        }

        public Builder policyTokenDefault(@Nullable String policyTokenDefault) {
            $.policyTokenDefault = policyTokenDefault;
            return this;
        }

        public Builder resize(@Nullable Boolean resize) {
            $.resize = resize;
            return this;
        }

        public Builder settingsTitle(@Nullable String settingsTitle) {
            $.settingsTitle = settingsTitle;
            return this;
        }

        public Builder superCacheRegion(@Nullable String superCacheRegion) {
            $.superCacheRegion = superCacheRegion;
            return this;
        }

        public Builder templateUuid(@Nullable String templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder trafficTitle(@Nullable String trafficTitle) {
            $.trafficTitle = trafficTitle;
            return this;
        }

        public Builder useExistingPolicySet(@Nullable Boolean useExistingPolicySet) {
            $.useExistingPolicySet = useExistingPolicySet;
            return this;
        }

        public Builder uuid(@Nullable String uuid) {
            $.uuid = uuid;
            return this;
        }

        public GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideo build() {
            return $;
        }
    }

}
