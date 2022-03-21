// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Active Directory configuration, relevant only for Cloud SQL for SQL Server.
 * 
 */
public final class SqlActiveDirectoryConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final SqlActiveDirectoryConfigResponse Empty = new SqlActiveDirectoryConfigResponse();

    /**
     * The name of the domain (e.g., mydomain.com).
     * 
     */
    @Import(name="domain", required=true)
      private final String domain;

    public String getDomain() {
        return this.domain;
    }

    /**
     * This is always sql#activeDirectoryConfig.
     * 
     */
    @Import(name="kind", required=true)
      private final String kind;

    public String getKind() {
        return this.kind;
    }

    public SqlActiveDirectoryConfigResponse(
        String domain,
        String kind) {
        this.domain = Objects.requireNonNull(domain, "expected parameter 'domain' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
    }

    private SqlActiveDirectoryConfigResponse() {
        this.domain = null;
        this.kind = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlActiveDirectoryConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String domain;
        private String kind;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlActiveDirectoryConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
    	      this.kind = defaults.kind;
        }

        public Builder domain(String domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }        public SqlActiveDirectoryConfigResponse build() {
            return new SqlActiveDirectoryConfigResponse(domain, kind);
        }
    }
}
