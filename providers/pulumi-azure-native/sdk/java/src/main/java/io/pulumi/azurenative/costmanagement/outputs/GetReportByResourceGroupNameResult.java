// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.outputs;

import io.pulumi.azurenative.costmanagement.outputs.ReportDefinitionResponse;
import io.pulumi.azurenative.costmanagement.outputs.ReportDeliveryInfoResponse;
import io.pulumi.azurenative.costmanagement.outputs.ReportScheduleResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetReportByResourceGroupNameResult {
    private final ReportDefinitionResponse definition;
    private final ReportDeliveryInfoResponse deliveryInfo;
    private final @Nullable String format;
    private final String id;
    private final String name;
    private final @Nullable ReportScheduleResponse schedule;
    private final Map<String,String> tags;
    private final String type;

    @OutputCustomType.Constructor({"definition","deliveryInfo","format","id","name","schedule","tags","type"})
    private GetReportByResourceGroupNameResult(
        ReportDefinitionResponse definition,
        ReportDeliveryInfoResponse deliveryInfo,
        @Nullable String format,
        String id,
        String name,
        @Nullable ReportScheduleResponse schedule,
        Map<String,String> tags,
        String type) {
        this.definition = Objects.requireNonNull(definition);
        this.deliveryInfo = Objects.requireNonNull(deliveryInfo);
        this.format = format;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.schedule = schedule;
        this.tags = Objects.requireNonNull(tags);
        this.type = Objects.requireNonNull(type);
    }

    public ReportDefinitionResponse getDefinition() {
        return this.definition;
    }
    public ReportDeliveryInfoResponse getDeliveryInfo() {
        return this.deliveryInfo;
    }
    public Optional<String> getFormat() {
        return Optional.ofNullable(this.format);
    }
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public Optional<ReportScheduleResponse> getSchedule() {
        return Optional.ofNullable(this.schedule);
    }
    public Map<String,String> getTags() {
        return this.tags;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReportByResourceGroupNameResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReportDefinitionResponse definition;
        private ReportDeliveryInfoResponse deliveryInfo;
        private @Nullable String format;
        private String id;
        private String name;
        private @Nullable ReportScheduleResponse schedule;
        private Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReportByResourceGroupNameResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.definition = defaults.definition;
    	      this.deliveryInfo = defaults.deliveryInfo;
    	      this.format = defaults.format;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.schedule = defaults.schedule;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setDefinition(ReportDefinitionResponse definition) {
            this.definition = Objects.requireNonNull(definition);
            return this;
        }

        public Builder setDeliveryInfo(ReportDeliveryInfoResponse deliveryInfo) {
            this.deliveryInfo = Objects.requireNonNull(deliveryInfo);
            return this;
        }

        public Builder setFormat(@Nullable String format) {
            this.format = format;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSchedule(@Nullable ReportScheduleResponse schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetReportByResourceGroupNameResult build() {
            return new GetReportByResourceGroupNameResult(definition, deliveryInfo, format, id, name, schedule, tags, type);
        }
    }
}
