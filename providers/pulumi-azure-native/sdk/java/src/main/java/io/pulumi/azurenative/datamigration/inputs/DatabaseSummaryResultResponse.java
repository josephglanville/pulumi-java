// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Summary of database results in the migration
 * 
 */
public final class DatabaseSummaryResultResponse extends io.pulumi.resources.InvokeArgs {

    public static final DatabaseSummaryResultResponse Empty = new DatabaseSummaryResultResponse();

    /**
     * Migration end time
     * 
     */
    @Import(name="endedOn", required=true)
      private final String endedOn;

    public String getEndedOn() {
        return this.endedOn;
    }

    /**
     * Wildcard string prefix to use for querying all errors of the item
     * 
     */
    @Import(name="errorPrefix", required=true)
      private final String errorPrefix;

    public String getErrorPrefix() {
        return this.errorPrefix;
    }

    /**
     * Number of successfully completed items
     * 
     */
    @Import(name="itemsCompletedCount", required=true)
      private final Double itemsCompletedCount;

    public Double getItemsCompletedCount() {
        return this.itemsCompletedCount;
    }

    /**
     * Number of items
     * 
     */
    @Import(name="itemsCount", required=true)
      private final Double itemsCount;

    public Double getItemsCount() {
        return this.itemsCount;
    }

    /**
     * Name of the item
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Wildcard string prefix to use for querying all sub-tem results of the item
     * 
     */
    @Import(name="resultPrefix", required=true)
      private final String resultPrefix;

    public String getResultPrefix() {
        return this.resultPrefix;
    }

    /**
     * Size of the database in megabytes
     * 
     */
    @Import(name="sizeMB", required=true)
      private final Double sizeMB;

    public Double getSizeMB() {
        return this.sizeMB;
    }

    /**
     * Migration start time
     * 
     */
    @Import(name="startedOn", required=true)
      private final String startedOn;

    public String getStartedOn() {
        return this.startedOn;
    }

    /**
     * Current state of migration
     * 
     */
    @Import(name="state", required=true)
      private final String state;

    public String getState() {
        return this.state;
    }

    /**
     * Status message
     * 
     */
    @Import(name="statusMessage", required=true)
      private final String statusMessage;

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public DatabaseSummaryResultResponse(
        String endedOn,
        String errorPrefix,
        Double itemsCompletedCount,
        Double itemsCount,
        String name,
        String resultPrefix,
        Double sizeMB,
        String startedOn,
        String state,
        String statusMessage) {
        this.endedOn = Objects.requireNonNull(endedOn, "expected parameter 'endedOn' to be non-null");
        this.errorPrefix = Objects.requireNonNull(errorPrefix, "expected parameter 'errorPrefix' to be non-null");
        this.itemsCompletedCount = Objects.requireNonNull(itemsCompletedCount, "expected parameter 'itemsCompletedCount' to be non-null");
        this.itemsCount = Objects.requireNonNull(itemsCount, "expected parameter 'itemsCount' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resultPrefix = Objects.requireNonNull(resultPrefix, "expected parameter 'resultPrefix' to be non-null");
        this.sizeMB = Objects.requireNonNull(sizeMB, "expected parameter 'sizeMB' to be non-null");
        this.startedOn = Objects.requireNonNull(startedOn, "expected parameter 'startedOn' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.statusMessage = Objects.requireNonNull(statusMessage, "expected parameter 'statusMessage' to be non-null");
    }

    private DatabaseSummaryResultResponse() {
        this.endedOn = null;
        this.errorPrefix = null;
        this.itemsCompletedCount = null;
        this.itemsCount = null;
        this.name = null;
        this.resultPrefix = null;
        this.sizeMB = null;
        this.startedOn = null;
        this.state = null;
        this.statusMessage = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseSummaryResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endedOn;
        private String errorPrefix;
        private Double itemsCompletedCount;
        private Double itemsCount;
        private String name;
        private String resultPrefix;
        private Double sizeMB;
        private String startedOn;
        private String state;
        private String statusMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseSummaryResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endedOn = defaults.endedOn;
    	      this.errorPrefix = defaults.errorPrefix;
    	      this.itemsCompletedCount = defaults.itemsCompletedCount;
    	      this.itemsCount = defaults.itemsCount;
    	      this.name = defaults.name;
    	      this.resultPrefix = defaults.resultPrefix;
    	      this.sizeMB = defaults.sizeMB;
    	      this.startedOn = defaults.startedOn;
    	      this.state = defaults.state;
    	      this.statusMessage = defaults.statusMessage;
        }

        public Builder endedOn(String endedOn) {
            this.endedOn = Objects.requireNonNull(endedOn);
            return this;
        }
        public Builder errorPrefix(String errorPrefix) {
            this.errorPrefix = Objects.requireNonNull(errorPrefix);
            return this;
        }
        public Builder itemsCompletedCount(Double itemsCompletedCount) {
            this.itemsCompletedCount = Objects.requireNonNull(itemsCompletedCount);
            return this;
        }
        public Builder itemsCount(Double itemsCount) {
            this.itemsCount = Objects.requireNonNull(itemsCount);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resultPrefix(String resultPrefix) {
            this.resultPrefix = Objects.requireNonNull(resultPrefix);
            return this;
        }
        public Builder sizeMB(Double sizeMB) {
            this.sizeMB = Objects.requireNonNull(sizeMB);
            return this;
        }
        public Builder startedOn(String startedOn) {
            this.startedOn = Objects.requireNonNull(startedOn);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder statusMessage(String statusMessage) {
            this.statusMessage = Objects.requireNonNull(statusMessage);
            return this;
        }        public DatabaseSummaryResultResponse build() {
            return new DatabaseSummaryResultResponse(endedOn, errorPrefix, itemsCompletedCount, itemsCount, name, resultPrefix, sizeMB, startedOn, state, statusMessage);
        }
    }
}
