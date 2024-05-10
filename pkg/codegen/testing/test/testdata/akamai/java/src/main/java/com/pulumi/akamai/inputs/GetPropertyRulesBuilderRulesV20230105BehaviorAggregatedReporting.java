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


public final class GetPropertyRulesBuilderRulesV20230105BehaviorAggregatedReporting extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorAggregatedReporting Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorAggregatedReporting();

    @Import(name="attribute1")
    private @Nullable String attribute1;

    public Optional<String> attribute1() {
        return Optional.ofNullable(this.attribute1);
    }

    @Import(name="attribute2")
    private @Nullable String attribute2;

    public Optional<String> attribute2() {
        return Optional.ofNullable(this.attribute2);
    }

    @Import(name="attribute3")
    private @Nullable String attribute3;

    public Optional<String> attribute3() {
        return Optional.ofNullable(this.attribute3);
    }

    @Import(name="attribute4")
    private @Nullable String attribute4;

    public Optional<String> attribute4() {
        return Optional.ofNullable(this.attribute4);
    }

    @Import(name="attributesCount")
    private @Nullable Integer attributesCount;

    public Optional<Integer> attributesCount() {
        return Optional.ofNullable(this.attributesCount);
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

    @Import(name="reportName")
    private @Nullable String reportName;

    public Optional<String> reportName() {
        return Optional.ofNullable(this.reportName);
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

    private GetPropertyRulesBuilderRulesV20230105BehaviorAggregatedReporting() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorAggregatedReporting(GetPropertyRulesBuilderRulesV20230105BehaviorAggregatedReporting $) {
        this.attribute1 = $.attribute1;
        this.attribute2 = $.attribute2;
        this.attribute3 = $.attribute3;
        this.attribute4 = $.attribute4;
        this.attributesCount = $.attributesCount;
        this.enabled = $.enabled;
        this.locked = $.locked;
        this.reportName = $.reportName;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorAggregatedReporting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorAggregatedReporting $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorAggregatedReporting();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorAggregatedReporting defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorAggregatedReporting(Objects.requireNonNull(defaults));
        }

        public Builder attribute1(@Nullable String attribute1) {
            $.attribute1 = attribute1;
            return this;
        }

        public Builder attribute2(@Nullable String attribute2) {
            $.attribute2 = attribute2;
            return this;
        }

        public Builder attribute3(@Nullable String attribute3) {
            $.attribute3 = attribute3;
            return this;
        }

        public Builder attribute4(@Nullable String attribute4) {
            $.attribute4 = attribute4;
            return this;
        }

        public Builder attributesCount(@Nullable Integer attributesCount) {
            $.attributesCount = attributesCount;
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

        public Builder reportName(@Nullable String reportName) {
            $.reportName = reportName;
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

        public GetPropertyRulesBuilderRulesV20230105BehaviorAggregatedReporting build() {
            return $;
        }
    }

}
