// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DataStoreInfoBaseResponse extends io.pulumi.resources.InvokeArgs {

    public static final DataStoreInfoBaseResponse Empty = new DataStoreInfoBaseResponse();

    @InputImport(name="dataStoreType", required=true)
    private final String dataStoreType;

    public String getDataStoreType() {
        return this.dataStoreType;
    }

    @InputImport(name="objectType", required=true)
    private final String objectType;

    public String getObjectType() {
        return this.objectType;
    }

    public DataStoreInfoBaseResponse(
        String dataStoreType,
        String objectType) {
        this.dataStoreType = Objects.requireNonNull(dataStoreType, "expected parameter 'dataStoreType' to be non-null");
        this.objectType = Objects.requireNonNull(objectType, "expected parameter 'objectType' to be non-null");
    }

    private DataStoreInfoBaseResponse() {
        this.dataStoreType = null;
        this.objectType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataStoreInfoBaseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataStoreType;
        private String objectType;

        public Builder() {
    	      // Empty
        }

        public Builder(DataStoreInfoBaseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataStoreType = defaults.dataStoreType;
    	      this.objectType = defaults.objectType;
        }

        public Builder setDataStoreType(String dataStoreType) {
            this.dataStoreType = Objects.requireNonNull(dataStoreType);
            return this;
        }

        public Builder setObjectType(String objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }

        public DataStoreInfoBaseResponse build() {
            return new DataStoreInfoBaseResponse(dataStoreType, objectType);
        }
    }
}
