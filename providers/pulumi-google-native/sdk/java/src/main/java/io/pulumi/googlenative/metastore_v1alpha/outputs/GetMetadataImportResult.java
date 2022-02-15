// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1alpha.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.metastore_v1alpha.outputs.DatabaseDumpResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetMetadataImportResult {
    private final String createTime;
    private final DatabaseDumpResponse databaseDump;
    private final String description;
    private final String endTime;
    private final String name;
    private final String state;
    private final String updateTime;

    @OutputCustomType.Constructor({"createTime","databaseDump","description","endTime","name","state","updateTime"})
    private GetMetadataImportResult(
        String createTime,
        DatabaseDumpResponse databaseDump,
        String description,
        String endTime,
        String name,
        String state,
        String updateTime) {
        this.createTime = Objects.requireNonNull(createTime);
        this.databaseDump = Objects.requireNonNull(databaseDump);
        this.description = Objects.requireNonNull(description);
        this.endTime = Objects.requireNonNull(endTime);
        this.name = Objects.requireNonNull(name);
        this.state = Objects.requireNonNull(state);
        this.updateTime = Objects.requireNonNull(updateTime);
    }

    public String getCreateTime() {
        return this.createTime;
    }
    public DatabaseDumpResponse getDatabaseDump() {
        return this.databaseDump;
    }
    public String getDescription() {
        return this.description;
    }
    public String getEndTime() {
        return this.endTime;
    }
    public String getName() {
        return this.name;
    }
    public String getState() {
        return this.state;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMetadataImportResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private DatabaseDumpResponse databaseDump;
        private String description;
        private String endTime;
        private String name;
        private String state;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMetadataImportResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.databaseDump = defaults.databaseDump;
    	      this.description = defaults.description;
    	      this.endTime = defaults.endTime;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDatabaseDump(DatabaseDumpResponse databaseDump) {
            this.databaseDump = Objects.requireNonNull(databaseDump);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setEndTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }

        public GetMetadataImportResult build() {
            return new GetMetadataImportResult(createTime, databaseDump, description, endTime, name, state, updateTime);
        }
    }
}