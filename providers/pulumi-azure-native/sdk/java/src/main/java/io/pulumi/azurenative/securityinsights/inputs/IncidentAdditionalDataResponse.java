// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class IncidentAdditionalDataResponse extends io.pulumi.resources.InvokeArgs {

    public static final IncidentAdditionalDataResponse Empty = new IncidentAdditionalDataResponse();

    @InputImport(name="alertProductNames", required=true)
    private final List<String> alertProductNames;

    public List<String> getAlertProductNames() {
        return this.alertProductNames;
    }

    @InputImport(name="alertsCount", required=true)
    private final Integer alertsCount;

    public Integer getAlertsCount() {
        return this.alertsCount;
    }

    @InputImport(name="bookmarksCount", required=true)
    private final Integer bookmarksCount;

    public Integer getBookmarksCount() {
        return this.bookmarksCount;
    }

    @InputImport(name="commentsCount", required=true)
    private final Integer commentsCount;

    public Integer getCommentsCount() {
        return this.commentsCount;
    }

    @InputImport(name="tactics", required=true)
    private final List<String> tactics;

    public List<String> getTactics() {
        return this.tactics;
    }

    public IncidentAdditionalDataResponse(
        List<String> alertProductNames,
        Integer alertsCount,
        Integer bookmarksCount,
        Integer commentsCount,
        List<String> tactics) {
        this.alertProductNames = Objects.requireNonNull(alertProductNames, "expected parameter 'alertProductNames' to be non-null");
        this.alertsCount = Objects.requireNonNull(alertsCount, "expected parameter 'alertsCount' to be non-null");
        this.bookmarksCount = Objects.requireNonNull(bookmarksCount, "expected parameter 'bookmarksCount' to be non-null");
        this.commentsCount = Objects.requireNonNull(commentsCount, "expected parameter 'commentsCount' to be non-null");
        this.tactics = Objects.requireNonNull(tactics, "expected parameter 'tactics' to be non-null");
    }

    private IncidentAdditionalDataResponse() {
        this.alertProductNames = List.of();
        this.alertsCount = null;
        this.bookmarksCount = null;
        this.commentsCount = null;
        this.tactics = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IncidentAdditionalDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> alertProductNames;
        private Integer alertsCount;
        private Integer bookmarksCount;
        private Integer commentsCount;
        private List<String> tactics;

        public Builder() {
    	      // Empty
        }

        public Builder(IncidentAdditionalDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertProductNames = defaults.alertProductNames;
    	      this.alertsCount = defaults.alertsCount;
    	      this.bookmarksCount = defaults.bookmarksCount;
    	      this.commentsCount = defaults.commentsCount;
    	      this.tactics = defaults.tactics;
        }

        public Builder setAlertProductNames(List<String> alertProductNames) {
            this.alertProductNames = Objects.requireNonNull(alertProductNames);
            return this;
        }

        public Builder setAlertsCount(Integer alertsCount) {
            this.alertsCount = Objects.requireNonNull(alertsCount);
            return this;
        }

        public Builder setBookmarksCount(Integer bookmarksCount) {
            this.bookmarksCount = Objects.requireNonNull(bookmarksCount);
            return this;
        }

        public Builder setCommentsCount(Integer commentsCount) {
            this.commentsCount = Objects.requireNonNull(commentsCount);
            return this;
        }

        public Builder setTactics(List<String> tactics) {
            this.tactics = Objects.requireNonNull(tactics);
            return this;
        }

        public IncidentAdditionalDataResponse build() {
            return new IncidentAdditionalDataResponse(alertProductNames, alertsCount, bookmarksCount, commentsCount, tactics);
        }
    }
}
