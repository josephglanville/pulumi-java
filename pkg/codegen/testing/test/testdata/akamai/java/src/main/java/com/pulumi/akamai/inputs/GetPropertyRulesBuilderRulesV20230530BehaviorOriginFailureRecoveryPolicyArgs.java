// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530BehaviorOriginFailureRecoveryPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorOriginFailureRecoveryPolicyArgs Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorOriginFailureRecoveryPolicyArgs();

    @Import(name="binaryEquivalentContent")
    private @Nullable Output<Boolean> binaryEquivalentContent;

    public Optional<Output<Boolean>> binaryEquivalentContent() {
        return Optional.ofNullable(this.binaryEquivalentContent);
    }

    @Import(name="enableIpAvoidance")
    private @Nullable Output<Boolean> enableIpAvoidance;

    public Optional<Output<Boolean>> enableIpAvoidance() {
        return Optional.ofNullable(this.enableIpAvoidance);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="ipAvoidanceErrorThreshold")
    private @Nullable Output<Integer> ipAvoidanceErrorThreshold;

    public Optional<Output<Integer>> ipAvoidanceErrorThreshold() {
        return Optional.ofNullable(this.ipAvoidanceErrorThreshold);
    }

    @Import(name="ipAvoidanceRetryInterval")
    private @Nullable Output<Integer> ipAvoidanceRetryInterval;

    public Optional<Output<Integer>> ipAvoidanceRetryInterval() {
        return Optional.ofNullable(this.ipAvoidanceRetryInterval);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="monitorOriginResponsiveness")
    private @Nullable Output<Boolean> monitorOriginResponsiveness;

    public Optional<Output<Boolean>> monitorOriginResponsiveness() {
        return Optional.ofNullable(this.monitorOriginResponsiveness);
    }

    @Import(name="monitorResponseCodes1s")
    private @Nullable Output<List<String>> monitorResponseCodes1s;

    public Optional<Output<List<String>>> monitorResponseCodes1s() {
        return Optional.ofNullable(this.monitorResponseCodes1s);
    }

    @Import(name="monitorResponseCodes2s")
    private @Nullable Output<List<String>> monitorResponseCodes2s;

    public Optional<Output<List<String>>> monitorResponseCodes2s() {
        return Optional.ofNullable(this.monitorResponseCodes2s);
    }

    @Import(name="monitorResponseCodes3s")
    private @Nullable Output<List<String>> monitorResponseCodes3s;

    public Optional<Output<List<String>>> monitorResponseCodes3s() {
        return Optional.ofNullable(this.monitorResponseCodes3s);
    }

    @Import(name="monitorStatusCodes1")
    private @Nullable Output<Boolean> monitorStatusCodes1;

    public Optional<Output<Boolean>> monitorStatusCodes1() {
        return Optional.ofNullable(this.monitorStatusCodes1);
    }

    @Import(name="monitorStatusCodes1EnableRecovery")
    private @Nullable Output<Boolean> monitorStatusCodes1EnableRecovery;

    public Optional<Output<Boolean>> monitorStatusCodes1EnableRecovery() {
        return Optional.ofNullable(this.monitorStatusCodes1EnableRecovery);
    }

    @Import(name="monitorStatusCodes1EnableRetry")
    private @Nullable Output<Boolean> monitorStatusCodes1EnableRetry;

    public Optional<Output<Boolean>> monitorStatusCodes1EnableRetry() {
        return Optional.ofNullable(this.monitorStatusCodes1EnableRetry);
    }

    @Import(name="monitorStatusCodes1RecoveryConfigName")
    private @Nullable Output<String> monitorStatusCodes1RecoveryConfigName;

    public Optional<Output<String>> monitorStatusCodes1RecoveryConfigName() {
        return Optional.ofNullable(this.monitorStatusCodes1RecoveryConfigName);
    }

    @Import(name="monitorStatusCodes2")
    private @Nullable Output<Boolean> monitorStatusCodes2;

    public Optional<Output<Boolean>> monitorStatusCodes2() {
        return Optional.ofNullable(this.monitorStatusCodes2);
    }

    @Import(name="monitorStatusCodes2EnableRecovery")
    private @Nullable Output<Boolean> monitorStatusCodes2EnableRecovery;

    public Optional<Output<Boolean>> monitorStatusCodes2EnableRecovery() {
        return Optional.ofNullable(this.monitorStatusCodes2EnableRecovery);
    }

    @Import(name="monitorStatusCodes2EnableRetry")
    private @Nullable Output<Boolean> monitorStatusCodes2EnableRetry;

    public Optional<Output<Boolean>> monitorStatusCodes2EnableRetry() {
        return Optional.ofNullable(this.monitorStatusCodes2EnableRetry);
    }

    @Import(name="monitorStatusCodes2RecoveryConfigName")
    private @Nullable Output<String> monitorStatusCodes2RecoveryConfigName;

    public Optional<Output<String>> monitorStatusCodes2RecoveryConfigName() {
        return Optional.ofNullable(this.monitorStatusCodes2RecoveryConfigName);
    }

    @Import(name="monitorStatusCodes3")
    private @Nullable Output<Boolean> monitorStatusCodes3;

    public Optional<Output<Boolean>> monitorStatusCodes3() {
        return Optional.ofNullable(this.monitorStatusCodes3);
    }

    @Import(name="monitorStatusCodes3EnableRecovery")
    private @Nullable Output<Boolean> monitorStatusCodes3EnableRecovery;

    public Optional<Output<Boolean>> monitorStatusCodes3EnableRecovery() {
        return Optional.ofNullable(this.monitorStatusCodes3EnableRecovery);
    }

    @Import(name="monitorStatusCodes3EnableRetry")
    private @Nullable Output<Boolean> monitorStatusCodes3EnableRetry;

    public Optional<Output<Boolean>> monitorStatusCodes3EnableRetry() {
        return Optional.ofNullable(this.monitorStatusCodes3EnableRetry);
    }

    @Import(name="monitorStatusCodes3RecoveryConfigName")
    private @Nullable Output<String> monitorStatusCodes3RecoveryConfigName;

    public Optional<Output<String>> monitorStatusCodes3RecoveryConfigName() {
        return Optional.ofNullable(this.monitorStatusCodes3RecoveryConfigName);
    }

    @Import(name="originResponsivenessCustomTimeout")
    private @Nullable Output<Integer> originResponsivenessCustomTimeout;

    public Optional<Output<Integer>> originResponsivenessCustomTimeout() {
        return Optional.ofNullable(this.originResponsivenessCustomTimeout);
    }

    @Import(name="originResponsivenessEnableRecovery")
    private @Nullable Output<Boolean> originResponsivenessEnableRecovery;

    public Optional<Output<Boolean>> originResponsivenessEnableRecovery() {
        return Optional.ofNullable(this.originResponsivenessEnableRecovery);
    }

    @Import(name="originResponsivenessEnableRetry")
    private @Nullable Output<Boolean> originResponsivenessEnableRetry;

    public Optional<Output<Boolean>> originResponsivenessEnableRetry() {
        return Optional.ofNullable(this.originResponsivenessEnableRetry);
    }

    @Import(name="originResponsivenessMonitoring")
    private @Nullable Output<String> originResponsivenessMonitoring;

    public Optional<Output<String>> originResponsivenessMonitoring() {
        return Optional.ofNullable(this.originResponsivenessMonitoring);
    }

    @Import(name="originResponsivenessRecoveryConfigName")
    private @Nullable Output<String> originResponsivenessRecoveryConfigName;

    public Optional<Output<String>> originResponsivenessRecoveryConfigName() {
        return Optional.ofNullable(this.originResponsivenessRecoveryConfigName);
    }

    @Import(name="originResponsivenessTimeout")
    private @Nullable Output<String> originResponsivenessTimeout;

    public Optional<Output<String>> originResponsivenessTimeout() {
        return Optional.ofNullable(this.originResponsivenessTimeout);
    }

    @Import(name="statusCodeMonitoring1")
    private @Nullable Output<String> statusCodeMonitoring1;

    public Optional<Output<String>> statusCodeMonitoring1() {
        return Optional.ofNullable(this.statusCodeMonitoring1);
    }

    @Import(name="statusCodeMonitoring2")
    private @Nullable Output<String> statusCodeMonitoring2;

    public Optional<Output<String>> statusCodeMonitoring2() {
        return Optional.ofNullable(this.statusCodeMonitoring2);
    }

    @Import(name="statusCodeMonitoring3")
    private @Nullable Output<String> statusCodeMonitoring3;

    public Optional<Output<String>> statusCodeMonitoring3() {
        return Optional.ofNullable(this.statusCodeMonitoring3);
    }

    @Import(name="templateUuid")
    private @Nullable Output<String> templateUuid;

    public Optional<Output<String>> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="tuningParameters")
    private @Nullable Output<String> tuningParameters;

    public Optional<Output<String>> tuningParameters() {
        return Optional.ofNullable(this.tuningParameters);
    }

    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private GetPropertyRulesBuilderRulesV20230530BehaviorOriginFailureRecoveryPolicyArgs() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorOriginFailureRecoveryPolicyArgs(GetPropertyRulesBuilderRulesV20230530BehaviorOriginFailureRecoveryPolicyArgs $) {
        this.binaryEquivalentContent = $.binaryEquivalentContent;
        this.enableIpAvoidance = $.enableIpAvoidance;
        this.enabled = $.enabled;
        this.ipAvoidanceErrorThreshold = $.ipAvoidanceErrorThreshold;
        this.ipAvoidanceRetryInterval = $.ipAvoidanceRetryInterval;
        this.locked = $.locked;
        this.monitorOriginResponsiveness = $.monitorOriginResponsiveness;
        this.monitorResponseCodes1s = $.monitorResponseCodes1s;
        this.monitorResponseCodes2s = $.monitorResponseCodes2s;
        this.monitorResponseCodes3s = $.monitorResponseCodes3s;
        this.monitorStatusCodes1 = $.monitorStatusCodes1;
        this.monitorStatusCodes1EnableRecovery = $.monitorStatusCodes1EnableRecovery;
        this.monitorStatusCodes1EnableRetry = $.monitorStatusCodes1EnableRetry;
        this.monitorStatusCodes1RecoveryConfigName = $.monitorStatusCodes1RecoveryConfigName;
        this.monitorStatusCodes2 = $.monitorStatusCodes2;
        this.monitorStatusCodes2EnableRecovery = $.monitorStatusCodes2EnableRecovery;
        this.monitorStatusCodes2EnableRetry = $.monitorStatusCodes2EnableRetry;
        this.monitorStatusCodes2RecoveryConfigName = $.monitorStatusCodes2RecoveryConfigName;
        this.monitorStatusCodes3 = $.monitorStatusCodes3;
        this.monitorStatusCodes3EnableRecovery = $.monitorStatusCodes3EnableRecovery;
        this.monitorStatusCodes3EnableRetry = $.monitorStatusCodes3EnableRetry;
        this.monitorStatusCodes3RecoveryConfigName = $.monitorStatusCodes3RecoveryConfigName;
        this.originResponsivenessCustomTimeout = $.originResponsivenessCustomTimeout;
        this.originResponsivenessEnableRecovery = $.originResponsivenessEnableRecovery;
        this.originResponsivenessEnableRetry = $.originResponsivenessEnableRetry;
        this.originResponsivenessMonitoring = $.originResponsivenessMonitoring;
        this.originResponsivenessRecoveryConfigName = $.originResponsivenessRecoveryConfigName;
        this.originResponsivenessTimeout = $.originResponsivenessTimeout;
        this.statusCodeMonitoring1 = $.statusCodeMonitoring1;
        this.statusCodeMonitoring2 = $.statusCodeMonitoring2;
        this.statusCodeMonitoring3 = $.statusCodeMonitoring3;
        this.templateUuid = $.templateUuid;
        this.tuningParameters = $.tuningParameters;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorOriginFailureRecoveryPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorOriginFailureRecoveryPolicyArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorOriginFailureRecoveryPolicyArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorOriginFailureRecoveryPolicyArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorOriginFailureRecoveryPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder binaryEquivalentContent(@Nullable Output<Boolean> binaryEquivalentContent) {
            $.binaryEquivalentContent = binaryEquivalentContent;
            return this;
        }

        public Builder binaryEquivalentContent(Boolean binaryEquivalentContent) {
            return binaryEquivalentContent(Output.of(binaryEquivalentContent));
        }

        public Builder enableIpAvoidance(@Nullable Output<Boolean> enableIpAvoidance) {
            $.enableIpAvoidance = enableIpAvoidance;
            return this;
        }

        public Builder enableIpAvoidance(Boolean enableIpAvoidance) {
            return enableIpAvoidance(Output.of(enableIpAvoidance));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder ipAvoidanceErrorThreshold(@Nullable Output<Integer> ipAvoidanceErrorThreshold) {
            $.ipAvoidanceErrorThreshold = ipAvoidanceErrorThreshold;
            return this;
        }

        public Builder ipAvoidanceErrorThreshold(Integer ipAvoidanceErrorThreshold) {
            return ipAvoidanceErrorThreshold(Output.of(ipAvoidanceErrorThreshold));
        }

        public Builder ipAvoidanceRetryInterval(@Nullable Output<Integer> ipAvoidanceRetryInterval) {
            $.ipAvoidanceRetryInterval = ipAvoidanceRetryInterval;
            return this;
        }

        public Builder ipAvoidanceRetryInterval(Integer ipAvoidanceRetryInterval) {
            return ipAvoidanceRetryInterval(Output.of(ipAvoidanceRetryInterval));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder monitorOriginResponsiveness(@Nullable Output<Boolean> monitorOriginResponsiveness) {
            $.monitorOriginResponsiveness = monitorOriginResponsiveness;
            return this;
        }

        public Builder monitorOriginResponsiveness(Boolean monitorOriginResponsiveness) {
            return monitorOriginResponsiveness(Output.of(monitorOriginResponsiveness));
        }

        public Builder monitorResponseCodes1s(@Nullable Output<List<String>> monitorResponseCodes1s) {
            $.monitorResponseCodes1s = monitorResponseCodes1s;
            return this;
        }

        public Builder monitorResponseCodes1s(List<String> monitorResponseCodes1s) {
            return monitorResponseCodes1s(Output.of(monitorResponseCodes1s));
        }

        public Builder monitorResponseCodes1s(String... monitorResponseCodes1s) {
            return monitorResponseCodes1s(List.of(monitorResponseCodes1s));
        }

        public Builder monitorResponseCodes2s(@Nullable Output<List<String>> monitorResponseCodes2s) {
            $.monitorResponseCodes2s = monitorResponseCodes2s;
            return this;
        }

        public Builder monitorResponseCodes2s(List<String> monitorResponseCodes2s) {
            return monitorResponseCodes2s(Output.of(monitorResponseCodes2s));
        }

        public Builder monitorResponseCodes2s(String... monitorResponseCodes2s) {
            return monitorResponseCodes2s(List.of(monitorResponseCodes2s));
        }

        public Builder monitorResponseCodes3s(@Nullable Output<List<String>> monitorResponseCodes3s) {
            $.monitorResponseCodes3s = monitorResponseCodes3s;
            return this;
        }

        public Builder monitorResponseCodes3s(List<String> monitorResponseCodes3s) {
            return monitorResponseCodes3s(Output.of(monitorResponseCodes3s));
        }

        public Builder monitorResponseCodes3s(String... monitorResponseCodes3s) {
            return monitorResponseCodes3s(List.of(monitorResponseCodes3s));
        }

        public Builder monitorStatusCodes1(@Nullable Output<Boolean> monitorStatusCodes1) {
            $.monitorStatusCodes1 = monitorStatusCodes1;
            return this;
        }

        public Builder monitorStatusCodes1(Boolean monitorStatusCodes1) {
            return monitorStatusCodes1(Output.of(monitorStatusCodes1));
        }

        public Builder monitorStatusCodes1EnableRecovery(@Nullable Output<Boolean> monitorStatusCodes1EnableRecovery) {
            $.monitorStatusCodes1EnableRecovery = monitorStatusCodes1EnableRecovery;
            return this;
        }

        public Builder monitorStatusCodes1EnableRecovery(Boolean monitorStatusCodes1EnableRecovery) {
            return monitorStatusCodes1EnableRecovery(Output.of(monitorStatusCodes1EnableRecovery));
        }

        public Builder monitorStatusCodes1EnableRetry(@Nullable Output<Boolean> monitorStatusCodes1EnableRetry) {
            $.monitorStatusCodes1EnableRetry = monitorStatusCodes1EnableRetry;
            return this;
        }

        public Builder monitorStatusCodes1EnableRetry(Boolean monitorStatusCodes1EnableRetry) {
            return monitorStatusCodes1EnableRetry(Output.of(monitorStatusCodes1EnableRetry));
        }

        public Builder monitorStatusCodes1RecoveryConfigName(@Nullable Output<String> monitorStatusCodes1RecoveryConfigName) {
            $.monitorStatusCodes1RecoveryConfigName = monitorStatusCodes1RecoveryConfigName;
            return this;
        }

        public Builder monitorStatusCodes1RecoveryConfigName(String monitorStatusCodes1RecoveryConfigName) {
            return monitorStatusCodes1RecoveryConfigName(Output.of(monitorStatusCodes1RecoveryConfigName));
        }

        public Builder monitorStatusCodes2(@Nullable Output<Boolean> monitorStatusCodes2) {
            $.monitorStatusCodes2 = monitorStatusCodes2;
            return this;
        }

        public Builder monitorStatusCodes2(Boolean monitorStatusCodes2) {
            return monitorStatusCodes2(Output.of(monitorStatusCodes2));
        }

        public Builder monitorStatusCodes2EnableRecovery(@Nullable Output<Boolean> monitorStatusCodes2EnableRecovery) {
            $.monitorStatusCodes2EnableRecovery = monitorStatusCodes2EnableRecovery;
            return this;
        }

        public Builder monitorStatusCodes2EnableRecovery(Boolean monitorStatusCodes2EnableRecovery) {
            return monitorStatusCodes2EnableRecovery(Output.of(monitorStatusCodes2EnableRecovery));
        }

        public Builder monitorStatusCodes2EnableRetry(@Nullable Output<Boolean> monitorStatusCodes2EnableRetry) {
            $.monitorStatusCodes2EnableRetry = monitorStatusCodes2EnableRetry;
            return this;
        }

        public Builder monitorStatusCodes2EnableRetry(Boolean monitorStatusCodes2EnableRetry) {
            return monitorStatusCodes2EnableRetry(Output.of(monitorStatusCodes2EnableRetry));
        }

        public Builder monitorStatusCodes2RecoveryConfigName(@Nullable Output<String> monitorStatusCodes2RecoveryConfigName) {
            $.monitorStatusCodes2RecoveryConfigName = monitorStatusCodes2RecoveryConfigName;
            return this;
        }

        public Builder monitorStatusCodes2RecoveryConfigName(String monitorStatusCodes2RecoveryConfigName) {
            return monitorStatusCodes2RecoveryConfigName(Output.of(monitorStatusCodes2RecoveryConfigName));
        }

        public Builder monitorStatusCodes3(@Nullable Output<Boolean> monitorStatusCodes3) {
            $.monitorStatusCodes3 = monitorStatusCodes3;
            return this;
        }

        public Builder monitorStatusCodes3(Boolean monitorStatusCodes3) {
            return monitorStatusCodes3(Output.of(monitorStatusCodes3));
        }

        public Builder monitorStatusCodes3EnableRecovery(@Nullable Output<Boolean> monitorStatusCodes3EnableRecovery) {
            $.monitorStatusCodes3EnableRecovery = monitorStatusCodes3EnableRecovery;
            return this;
        }

        public Builder monitorStatusCodes3EnableRecovery(Boolean monitorStatusCodes3EnableRecovery) {
            return monitorStatusCodes3EnableRecovery(Output.of(monitorStatusCodes3EnableRecovery));
        }

        public Builder monitorStatusCodes3EnableRetry(@Nullable Output<Boolean> monitorStatusCodes3EnableRetry) {
            $.monitorStatusCodes3EnableRetry = monitorStatusCodes3EnableRetry;
            return this;
        }

        public Builder monitorStatusCodes3EnableRetry(Boolean monitorStatusCodes3EnableRetry) {
            return monitorStatusCodes3EnableRetry(Output.of(monitorStatusCodes3EnableRetry));
        }

        public Builder monitorStatusCodes3RecoveryConfigName(@Nullable Output<String> monitorStatusCodes3RecoveryConfigName) {
            $.monitorStatusCodes3RecoveryConfigName = monitorStatusCodes3RecoveryConfigName;
            return this;
        }

        public Builder monitorStatusCodes3RecoveryConfigName(String monitorStatusCodes3RecoveryConfigName) {
            return monitorStatusCodes3RecoveryConfigName(Output.of(monitorStatusCodes3RecoveryConfigName));
        }

        public Builder originResponsivenessCustomTimeout(@Nullable Output<Integer> originResponsivenessCustomTimeout) {
            $.originResponsivenessCustomTimeout = originResponsivenessCustomTimeout;
            return this;
        }

        public Builder originResponsivenessCustomTimeout(Integer originResponsivenessCustomTimeout) {
            return originResponsivenessCustomTimeout(Output.of(originResponsivenessCustomTimeout));
        }

        public Builder originResponsivenessEnableRecovery(@Nullable Output<Boolean> originResponsivenessEnableRecovery) {
            $.originResponsivenessEnableRecovery = originResponsivenessEnableRecovery;
            return this;
        }

        public Builder originResponsivenessEnableRecovery(Boolean originResponsivenessEnableRecovery) {
            return originResponsivenessEnableRecovery(Output.of(originResponsivenessEnableRecovery));
        }

        public Builder originResponsivenessEnableRetry(@Nullable Output<Boolean> originResponsivenessEnableRetry) {
            $.originResponsivenessEnableRetry = originResponsivenessEnableRetry;
            return this;
        }

        public Builder originResponsivenessEnableRetry(Boolean originResponsivenessEnableRetry) {
            return originResponsivenessEnableRetry(Output.of(originResponsivenessEnableRetry));
        }

        public Builder originResponsivenessMonitoring(@Nullable Output<String> originResponsivenessMonitoring) {
            $.originResponsivenessMonitoring = originResponsivenessMonitoring;
            return this;
        }

        public Builder originResponsivenessMonitoring(String originResponsivenessMonitoring) {
            return originResponsivenessMonitoring(Output.of(originResponsivenessMonitoring));
        }

        public Builder originResponsivenessRecoveryConfigName(@Nullable Output<String> originResponsivenessRecoveryConfigName) {
            $.originResponsivenessRecoveryConfigName = originResponsivenessRecoveryConfigName;
            return this;
        }

        public Builder originResponsivenessRecoveryConfigName(String originResponsivenessRecoveryConfigName) {
            return originResponsivenessRecoveryConfigName(Output.of(originResponsivenessRecoveryConfigName));
        }

        public Builder originResponsivenessTimeout(@Nullable Output<String> originResponsivenessTimeout) {
            $.originResponsivenessTimeout = originResponsivenessTimeout;
            return this;
        }

        public Builder originResponsivenessTimeout(String originResponsivenessTimeout) {
            return originResponsivenessTimeout(Output.of(originResponsivenessTimeout));
        }

        public Builder statusCodeMonitoring1(@Nullable Output<String> statusCodeMonitoring1) {
            $.statusCodeMonitoring1 = statusCodeMonitoring1;
            return this;
        }

        public Builder statusCodeMonitoring1(String statusCodeMonitoring1) {
            return statusCodeMonitoring1(Output.of(statusCodeMonitoring1));
        }

        public Builder statusCodeMonitoring2(@Nullable Output<String> statusCodeMonitoring2) {
            $.statusCodeMonitoring2 = statusCodeMonitoring2;
            return this;
        }

        public Builder statusCodeMonitoring2(String statusCodeMonitoring2) {
            return statusCodeMonitoring2(Output.of(statusCodeMonitoring2));
        }

        public Builder statusCodeMonitoring3(@Nullable Output<String> statusCodeMonitoring3) {
            $.statusCodeMonitoring3 = statusCodeMonitoring3;
            return this;
        }

        public Builder statusCodeMonitoring3(String statusCodeMonitoring3) {
            return statusCodeMonitoring3(Output.of(statusCodeMonitoring3));
        }

        public Builder templateUuid(@Nullable Output<String> templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder templateUuid(String templateUuid) {
            return templateUuid(Output.of(templateUuid));
        }

        public Builder tuningParameters(@Nullable Output<String> tuningParameters) {
            $.tuningParameters = tuningParameters;
            return this;
        }

        public Builder tuningParameters(String tuningParameters) {
            return tuningParameters(Output.of(tuningParameters));
        }

        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public GetPropertyRulesBuilderRulesV20230530BehaviorOriginFailureRecoveryPolicyArgs build() {
            return $;
        }
    }

}
