// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.billingbudgets_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.billingbudgets_v1beta1.outputs.GoogleCloudBillingBudgetsV1beta1CustomPeriodResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudBillingBudgetsV1beta1FilterResponse {
    private final String calendarPeriod;
    private final List<String> creditTypes;
    private final String creditTypesTreatment;
    private final GoogleCloudBillingBudgetsV1beta1CustomPeriodResponse customPeriod;
    private final Map<String,String> labels;
    private final List<String> projects;
    private final List<String> services;
    private final List<String> subaccounts;

    @OutputCustomType.Constructor({"calendarPeriod","creditTypes","creditTypesTreatment","customPeriod","labels","projects","services","subaccounts"})
    private GoogleCloudBillingBudgetsV1beta1FilterResponse(
        String calendarPeriod,
        List<String> creditTypes,
        String creditTypesTreatment,
        GoogleCloudBillingBudgetsV1beta1CustomPeriodResponse customPeriod,
        Map<String,String> labels,
        List<String> projects,
        List<String> services,
        List<String> subaccounts) {
        this.calendarPeriod = Objects.requireNonNull(calendarPeriod);
        this.creditTypes = Objects.requireNonNull(creditTypes);
        this.creditTypesTreatment = Objects.requireNonNull(creditTypesTreatment);
        this.customPeriod = Objects.requireNonNull(customPeriod);
        this.labels = Objects.requireNonNull(labels);
        this.projects = Objects.requireNonNull(projects);
        this.services = Objects.requireNonNull(services);
        this.subaccounts = Objects.requireNonNull(subaccounts);
    }

    public String getCalendarPeriod() {
        return this.calendarPeriod;
    }
    public List<String> getCreditTypes() {
        return this.creditTypes;
    }
    public String getCreditTypesTreatment() {
        return this.creditTypesTreatment;
    }
    public GoogleCloudBillingBudgetsV1beta1CustomPeriodResponse getCustomPeriod() {
        return this.customPeriod;
    }
    public Map<String,String> getLabels() {
        return this.labels;
    }
    public List<String> getProjects() {
        return this.projects;
    }
    public List<String> getServices() {
        return this.services;
    }
    public List<String> getSubaccounts() {
        return this.subaccounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudBillingBudgetsV1beta1FilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String calendarPeriod;
        private List<String> creditTypes;
        private String creditTypesTreatment;
        private GoogleCloudBillingBudgetsV1beta1CustomPeriodResponse customPeriod;
        private Map<String,String> labels;
        private List<String> projects;
        private List<String> services;
        private List<String> subaccounts;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudBillingBudgetsV1beta1FilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.calendarPeriod = defaults.calendarPeriod;
    	      this.creditTypes = defaults.creditTypes;
    	      this.creditTypesTreatment = defaults.creditTypesTreatment;
    	      this.customPeriod = defaults.customPeriod;
    	      this.labels = defaults.labels;
    	      this.projects = defaults.projects;
    	      this.services = defaults.services;
    	      this.subaccounts = defaults.subaccounts;
        }

        public Builder setCalendarPeriod(String calendarPeriod) {
            this.calendarPeriod = Objects.requireNonNull(calendarPeriod);
            return this;
        }

        public Builder setCreditTypes(List<String> creditTypes) {
            this.creditTypes = Objects.requireNonNull(creditTypes);
            return this;
        }

        public Builder setCreditTypesTreatment(String creditTypesTreatment) {
            this.creditTypesTreatment = Objects.requireNonNull(creditTypesTreatment);
            return this;
        }

        public Builder setCustomPeriod(GoogleCloudBillingBudgetsV1beta1CustomPeriodResponse customPeriod) {
            this.customPeriod = Objects.requireNonNull(customPeriod);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setProjects(List<String> projects) {
            this.projects = Objects.requireNonNull(projects);
            return this;
        }

        public Builder setServices(List<String> services) {
            this.services = Objects.requireNonNull(services);
            return this;
        }

        public Builder setSubaccounts(List<String> subaccounts) {
            this.subaccounts = Objects.requireNonNull(subaccounts);
            return this;
        }

        public GoogleCloudBillingBudgetsV1beta1FilterResponse build() {
            return new GoogleCloudBillingBudgetsV1beta1FilterResponse(calendarPeriod, creditTypes, creditTypesTreatment, customPeriod, labels, projects, services, subaccounts);
        }
    }
}