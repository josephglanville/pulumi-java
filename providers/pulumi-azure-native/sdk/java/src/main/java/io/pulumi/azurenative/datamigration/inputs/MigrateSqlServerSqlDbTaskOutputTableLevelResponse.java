// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


public final class MigrateSqlServerSqlDbTaskOutputTableLevelResponse extends io.pulumi.resources.InvokeArgs {

    public static final MigrateSqlServerSqlDbTaskOutputTableLevelResponse Empty = new MigrateSqlServerSqlDbTaskOutputTableLevelResponse();

    @InputImport(name="endedOn", required=true)
    private final String endedOn;

    public String getEndedOn() {
        return this.endedOn;
    }

    @InputImport(name="errorPrefix", required=true)
    private final String errorPrefix;

    public String getErrorPrefix() {
        return this.errorPrefix;
    }

    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    @InputImport(name="itemsCompletedCount", required=true)
    private final Double itemsCompletedCount;

    public Double getItemsCompletedCount() {
        return this.itemsCompletedCount;
    }

    @InputImport(name="itemsCount", required=true)
    private final Double itemsCount;

    public Double getItemsCount() {
        return this.itemsCount;
    }

    @InputImport(name="objectName", required=true)
    private final String objectName;

    public String getObjectName() {
        return this.objectName;
    }

    @InputImport(name="resultPrefix", required=true)
    private final String resultPrefix;

    public String getResultPrefix() {
        return this.resultPrefix;
    }

    @InputImport(name="resultType", required=true)
    private final String resultType;

    public String getResultType() {
        return this.resultType;
    }

    @InputImport(name="startedOn", required=true)
    private final String startedOn;

    public String getStartedOn() {
        return this.startedOn;
    }

    @InputImport(name="state", required=true)
    private final String state;

    public String getState() {
        return this.state;
    }

    @InputImport(name="statusMessage", required=true)
    private final String statusMessage;

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public MigrateSqlServerSqlDbTaskOutputTableLevelResponse(
        String endedOn,
        String errorPrefix,
        String id,
        Double itemsCompletedCount,
        Double itemsCount,
        String objectName,
        String resultPrefix,
        String resultType,
        String startedOn,
        String state,
        String statusMessage) {
        this.endedOn = Objects.requireNonNull(endedOn, "expected parameter 'endedOn' to be non-null");
        this.errorPrefix = Objects.requireNonNull(errorPrefix, "expected parameter 'errorPrefix' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.itemsCompletedCount = Objects.requireNonNull(itemsCompletedCount, "expected parameter 'itemsCompletedCount' to be non-null");
        this.itemsCount = Objects.requireNonNull(itemsCount, "expected parameter 'itemsCount' to be non-null");
        this.objectName = Objects.requireNonNull(objectName, "expected parameter 'objectName' to be non-null");
        this.resultPrefix = Objects.requireNonNull(resultPrefix, "expected parameter 'resultPrefix' to be non-null");
        this.resultType = Objects.requireNonNull(resultType, "expected parameter 'resultType' to be non-null");
        this.startedOn = Objects.requireNonNull(startedOn, "expected parameter 'startedOn' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.statusMessage = Objects.requireNonNull(statusMessage, "expected parameter 'statusMessage' to be non-null");
    }

    private MigrateSqlServerSqlDbTaskOutputTableLevelResponse() {
        this.endedOn = null;
        this.errorPrefix = null;
        this.id = null;
        this.itemsCompletedCount = null;
        this.itemsCount = null;
        this.objectName = null;
        this.resultPrefix = null;
        this.resultType = null;
        this.startedOn = null;
        this.state = null;
        this.statusMessage = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlDbTaskOutputTableLevelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endedOn;
        private String errorPrefix;
        private String id;
        private Double itemsCompletedCount;
        private Double itemsCount;
        private String objectName;
        private String resultPrefix;
        private String resultType;
        private String startedOn;
        private String state;
        private String statusMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlDbTaskOutputTableLevelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endedOn = defaults.endedOn;
    	      this.errorPrefix = defaults.errorPrefix;
    	      this.id = defaults.id;
    	      this.itemsCompletedCount = defaults.itemsCompletedCount;
    	      this.itemsCount = defaults.itemsCount;
    	      this.objectName = defaults.objectName;
    	      this.resultPrefix = defaults.resultPrefix;
    	      this.resultType = defaults.resultType;
    	      this.startedOn = defaults.startedOn;
    	      this.state = defaults.state;
    	      this.statusMessage = defaults.statusMessage;
        }

        public Builder setEndedOn(String endedOn) {
            this.endedOn = Objects.requireNonNull(endedOn);
            return this;
        }

        public Builder setErrorPrefix(String errorPrefix) {
            this.errorPrefix = Objects.requireNonNull(errorPrefix);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setItemsCompletedCount(Double itemsCompletedCount) {
            this.itemsCompletedCount = Objects.requireNonNull(itemsCompletedCount);
            return this;
        }

        public Builder setItemsCount(Double itemsCount) {
            this.itemsCount = Objects.requireNonNull(itemsCount);
            return this;
        }

        public Builder setObjectName(String objectName) {
            this.objectName = Objects.requireNonNull(objectName);
            return this;
        }

        public Builder setResultPrefix(String resultPrefix) {
            this.resultPrefix = Objects.requireNonNull(resultPrefix);
            return this;
        }

        public Builder setResultType(String resultType) {
            this.resultType = Objects.requireNonNull(resultType);
            return this;
        }

        public Builder setStartedOn(String startedOn) {
            this.startedOn = Objects.requireNonNull(startedOn);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setStatusMessage(String statusMessage) {
            this.statusMessage = Objects.requireNonNull(statusMessage);
            return this;
        }

        public MigrateSqlServerSqlDbTaskOutputTableLevelResponse build() {
            return new MigrateSqlServerSqlDbTaskOutputTableLevelResponse(endedOn, errorPrefix, id, itemsCompletedCount, itemsCount, objectName, resultPrefix, resultType, startedOn, state, statusMessage);
        }
    }
}
