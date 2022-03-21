// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1beta.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.metastore_v1beta.inputs.SecretResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration information for a Kerberos principal.
 * 
 */
public final class KerberosConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final KerberosConfigResponse Empty = new KerberosConfigResponse();

    /**
     * A Kerberos keytab file that can be used to authenticate a service principal with a Kerberos Key Distribution Center (KDC).
     * 
     */
    @Import(name="keytab", required=true)
      private final SecretResponse keytab;

    public SecretResponse getKeytab() {
        return this.keytab;
    }

    /**
     * A Cloud Storage URI that specifies the path to a krb5.conf file. It is of the form gs://{bucket_name}/path/to/krb5.conf, although the file does not need to be named krb5.conf explicitly.
     * 
     */
    @Import(name="krb5ConfigGcsUri", required=true)
      private final String krb5ConfigGcsUri;

    public String getKrb5ConfigGcsUri() {
        return this.krb5ConfigGcsUri;
    }

    /**
     * A Kerberos principal that exists in the both the keytab the KDC to authenticate as. A typical principal is of the form primary/instance@REALM, but there is no exact format.
     * 
     */
    @Import(name="principal", required=true)
      private final String principal;

    public String getPrincipal() {
        return this.principal;
    }

    public KerberosConfigResponse(
        SecretResponse keytab,
        String krb5ConfigGcsUri,
        String principal) {
        this.keytab = Objects.requireNonNull(keytab, "expected parameter 'keytab' to be non-null");
        this.krb5ConfigGcsUri = Objects.requireNonNull(krb5ConfigGcsUri, "expected parameter 'krb5ConfigGcsUri' to be non-null");
        this.principal = Objects.requireNonNull(principal, "expected parameter 'principal' to be non-null");
    }

    private KerberosConfigResponse() {
        this.keytab = null;
        this.krb5ConfigGcsUri = null;
        this.principal = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KerberosConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretResponse keytab;
        private String krb5ConfigGcsUri;
        private String principal;

        public Builder() {
    	      // Empty
        }

        public Builder(KerberosConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keytab = defaults.keytab;
    	      this.krb5ConfigGcsUri = defaults.krb5ConfigGcsUri;
    	      this.principal = defaults.principal;
        }

        public Builder keytab(SecretResponse keytab) {
            this.keytab = Objects.requireNonNull(keytab);
            return this;
        }
        public Builder krb5ConfigGcsUri(String krb5ConfigGcsUri) {
            this.krb5ConfigGcsUri = Objects.requireNonNull(krb5ConfigGcsUri);
            return this;
        }
        public Builder principal(String principal) {
            this.principal = Objects.requireNonNull(principal);
            return this;
        }        public KerberosConfigResponse build() {
            return new KerberosConfigResponse(keytab, krb5ConfigGcsUri, principal);
        }
    }
}
