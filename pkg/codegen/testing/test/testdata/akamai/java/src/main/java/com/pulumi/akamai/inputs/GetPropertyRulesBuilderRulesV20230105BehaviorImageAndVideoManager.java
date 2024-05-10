// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230105BehaviorImageAndVideoManagerCpCodeOriginal;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230105BehaviorImageAndVideoManagerCpCodeTransformed;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105BehaviorImageAndVideoManager extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorImageAndVideoManager Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorImageAndVideoManager();

    @Import(name="applyBestFileType")
    private @Nullable Boolean applyBestFileType;

    public Optional<Boolean> applyBestFileType() {
        return Optional.ofNullable(this.applyBestFileType);
    }

    @Import(name="cpCodeOriginal")
    private @Nullable GetPropertyRulesBuilderRulesV20230105BehaviorImageAndVideoManagerCpCodeOriginal cpCodeOriginal;

    public Optional<GetPropertyRulesBuilderRulesV20230105BehaviorImageAndVideoManagerCpCodeOriginal> cpCodeOriginal() {
        return Optional.ofNullable(this.cpCodeOriginal);
    }

    @Import(name="cpCodeTransformed")
    private @Nullable GetPropertyRulesBuilderRulesV20230105BehaviorImageAndVideoManagerCpCodeTransformed cpCodeTransformed;

    public Optional<GetPropertyRulesBuilderRulesV20230105BehaviorImageAndVideoManagerCpCodeTransformed> cpCodeTransformed() {
        return Optional.ofNullable(this.cpCodeTransformed);
    }

    @Import(name="enabled")
    private @Nullable Boolean enabled;

    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="imageSet")
    private @Nullable String imageSet;

    public Optional<String> imageSet() {
        return Optional.ofNullable(this.imageSet);
    }

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="policySetType")
    private @Nullable String policySetType;

    public Optional<String> policySetType() {
        return Optional.ofNullable(this.policySetType);
    }

    @Import(name="resize")
    private @Nullable Boolean resize;

    public Optional<Boolean> resize() {
        return Optional.ofNullable(this.resize);
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

    @Import(name="videoSet")
    private @Nullable String videoSet;

    public Optional<String> videoSet() {
        return Optional.ofNullable(this.videoSet);
    }

    private GetPropertyRulesBuilderRulesV20230105BehaviorImageAndVideoManager() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorImageAndVideoManager(GetPropertyRulesBuilderRulesV20230105BehaviorImageAndVideoManager $) {
        this.applyBestFileType = $.applyBestFileType;
        this.cpCodeOriginal = $.cpCodeOriginal;
        this.cpCodeTransformed = $.cpCodeTransformed;
        this.enabled = $.enabled;
        this.imageSet = $.imageSet;
        this.locked = $.locked;
        this.policySetType = $.policySetType;
        this.resize = $.resize;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
        this.videoSet = $.videoSet;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorImageAndVideoManager defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorImageAndVideoManager $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorImageAndVideoManager();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorImageAndVideoManager defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorImageAndVideoManager(Objects.requireNonNull(defaults));
        }

        public Builder applyBestFileType(@Nullable Boolean applyBestFileType) {
            $.applyBestFileType = applyBestFileType;
            return this;
        }

        public Builder cpCodeOriginal(@Nullable GetPropertyRulesBuilderRulesV20230105BehaviorImageAndVideoManagerCpCodeOriginal cpCodeOriginal) {
            $.cpCodeOriginal = cpCodeOriginal;
            return this;
        }

        public Builder cpCodeTransformed(@Nullable GetPropertyRulesBuilderRulesV20230105BehaviorImageAndVideoManagerCpCodeTransformed cpCodeTransformed) {
            $.cpCodeTransformed = cpCodeTransformed;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder imageSet(@Nullable String imageSet) {
            $.imageSet = imageSet;
            return this;
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder policySetType(@Nullable String policySetType) {
            $.policySetType = policySetType;
            return this;
        }

        public Builder resize(@Nullable Boolean resize) {
            $.resize = resize;
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

        public Builder videoSet(@Nullable String videoSet) {
            $.videoSet = videoSet;
            return this;
        }

        public GetPropertyRulesBuilderRulesV20230105BehaviorImageAndVideoManager build() {
            return $;
        }
    }

}
