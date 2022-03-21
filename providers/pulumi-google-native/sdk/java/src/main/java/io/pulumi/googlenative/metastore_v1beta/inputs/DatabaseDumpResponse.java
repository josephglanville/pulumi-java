// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A specification of the location of and metadata about a database dump from a relational database management system.
 * 
 */
public final class DatabaseDumpResponse extends io.pulumi.resources.InvokeArgs {

    public static final DatabaseDumpResponse Empty = new DatabaseDumpResponse();

    /**
     * The type of the database.
     * 
     */
    @Import(name="databaseType", required=true)
      private final String databaseType;

    public String getDatabaseType() {
        return this.databaseType;
    }

    /**
     * A Cloud Storage object or folder URI that specifies the source from which to import metadata. It must begin with gs://.
     * 
     */
    @Import(name="gcsUri", required=true)
      private final String gcsUri;

    public String getGcsUri() {
        return this.gcsUri;
    }

    /**
     * The name of the source database.
     * 
     */
    @Import(name="sourceDatabase", required=true)
      private final String sourceDatabase;

    public String getSourceDatabase() {
        return this.sourceDatabase;
    }

    /**
     * Optional. The type of the database dump. If unspecified, defaults to MYSQL.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public DatabaseDumpResponse(
        String databaseType,
        String gcsUri,
        String sourceDatabase,
        String type) {
        this.databaseType = Objects.requireNonNull(databaseType, "expected parameter 'databaseType' to be non-null");
        this.gcsUri = Objects.requireNonNull(gcsUri, "expected parameter 'gcsUri' to be non-null");
        this.sourceDatabase = Objects.requireNonNull(sourceDatabase, "expected parameter 'sourceDatabase' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private DatabaseDumpResponse() {
        this.databaseType = null;
        this.gcsUri = null;
        this.sourceDatabase = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseDumpResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String databaseType;
        private String gcsUri;
        private String sourceDatabase;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseDumpResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseType = defaults.databaseType;
    	      this.gcsUri = defaults.gcsUri;
    	      this.sourceDatabase = defaults.sourceDatabase;
    	      this.type = defaults.type;
        }

        public Builder databaseType(String databaseType) {
            this.databaseType = Objects.requireNonNull(databaseType);
            return this;
        }
        public Builder gcsUri(String gcsUri) {
            this.gcsUri = Objects.requireNonNull(gcsUri);
            return this;
        }
        public Builder sourceDatabase(String sourceDatabase) {
            this.sourceDatabase = Objects.requireNonNull(sourceDatabase);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public DatabaseDumpResponse build() {
            return new DatabaseDumpResponse(databaseType, gcsUri, sourceDatabase, type);
        }
    }
}
