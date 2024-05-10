// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatastreamElasticsearchConnectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatastreamElasticsearchConnectorArgs Empty = new DatastreamElasticsearchConnectorArgs();

    @Import(name="caCert")
    private @Nullable Output<String> caCert;

    public Optional<Output<String>> caCert() {
        return Optional.ofNullable(this.caCert);
    }

    @Import(name="clientCert")
    private @Nullable Output<String> clientCert;

    public Optional<Output<String>> clientCert() {
        return Optional.ofNullable(this.clientCert);
    }

    @Import(name="clientKey")
    private @Nullable Output<String> clientKey;

    public Optional<Output<String>> clientKey() {
        return Optional.ofNullable(this.clientKey);
    }

    @Import(name="contentType")
    private @Nullable Output<String> contentType;

    public Optional<Output<String>> contentType() {
        return Optional.ofNullable(this.contentType);
    }

    @Import(name="customHeaderName")
    private @Nullable Output<String> customHeaderName;

    public Optional<Output<String>> customHeaderName() {
        return Optional.ofNullable(this.customHeaderName);
    }

    @Import(name="customHeaderValue")
    private @Nullable Output<String> customHeaderValue;

    public Optional<Output<String>> customHeaderValue() {
        return Optional.ofNullable(this.customHeaderValue);
    }

    @Import(name="displayName", required=true)
    private Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName;
    }

    @Import(name="endpoint", required=true)
    private Output<String> endpoint;

    public Output<String> endpoint() {
        return this.endpoint;
    }

    @Import(name="indexName", required=true)
    private Output<String> indexName;

    public Output<String> indexName() {
        return this.indexName;
    }

    @Import(name="mTls")
    private @Nullable Output<Boolean> mTls;

    public Optional<Output<Boolean>> mTls() {
        return Optional.ofNullable(this.mTls);
    }

    @Import(name="password", required=true)
    private Output<String> password;

    public Output<String> password() {
        return this.password;
    }

    @Import(name="tlsHostname")
    private @Nullable Output<String> tlsHostname;

    public Optional<Output<String>> tlsHostname() {
        return Optional.ofNullable(this.tlsHostname);
    }

    @Import(name="userName", required=true)
    private Output<String> userName;

    public Output<String> userName() {
        return this.userName;
    }

    private DatastreamElasticsearchConnectorArgs() {}

    private DatastreamElasticsearchConnectorArgs(DatastreamElasticsearchConnectorArgs $) {
        this.caCert = $.caCert;
        this.clientCert = $.clientCert;
        this.clientKey = $.clientKey;
        this.contentType = $.contentType;
        this.customHeaderName = $.customHeaderName;
        this.customHeaderValue = $.customHeaderValue;
        this.displayName = $.displayName;
        this.endpoint = $.endpoint;
        this.indexName = $.indexName;
        this.mTls = $.mTls;
        this.password = $.password;
        this.tlsHostname = $.tlsHostname;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatastreamElasticsearchConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatastreamElasticsearchConnectorArgs $;

        public Builder() {
            $ = new DatastreamElasticsearchConnectorArgs();
        }

        public Builder(DatastreamElasticsearchConnectorArgs defaults) {
            $ = new DatastreamElasticsearchConnectorArgs(Objects.requireNonNull(defaults));
        }

        public Builder caCert(@Nullable Output<String> caCert) {
            $.caCert = caCert;
            return this;
        }

        public Builder caCert(String caCert) {
            return caCert(Output.of(caCert));
        }

        public Builder clientCert(@Nullable Output<String> clientCert) {
            $.clientCert = clientCert;
            return this;
        }

        public Builder clientCert(String clientCert) {
            return clientCert(Output.of(clientCert));
        }

        public Builder clientKey(@Nullable Output<String> clientKey) {
            $.clientKey = clientKey;
            return this;
        }

        public Builder clientKey(String clientKey) {
            return clientKey(Output.of(clientKey));
        }

        public Builder contentType(@Nullable Output<String> contentType) {
            $.contentType = contentType;
            return this;
        }

        public Builder contentType(String contentType) {
            return contentType(Output.of(contentType));
        }

        public Builder customHeaderName(@Nullable Output<String> customHeaderName) {
            $.customHeaderName = customHeaderName;
            return this;
        }

        public Builder customHeaderName(String customHeaderName) {
            return customHeaderName(Output.of(customHeaderName));
        }

        public Builder customHeaderValue(@Nullable Output<String> customHeaderValue) {
            $.customHeaderValue = customHeaderValue;
            return this;
        }

        public Builder customHeaderValue(String customHeaderValue) {
            return customHeaderValue(Output.of(customHeaderValue));
        }

        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder endpoint(Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        public Builder indexName(Output<String> indexName) {
            $.indexName = indexName;
            return this;
        }

        public Builder indexName(String indexName) {
            return indexName(Output.of(indexName));
        }

        public Builder mTls(@Nullable Output<Boolean> mTls) {
            $.mTls = mTls;
            return this;
        }

        public Builder mTls(Boolean mTls) {
            return mTls(Output.of(mTls));
        }

        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        public Builder password(String password) {
            return password(Output.of(password));
        }

        public Builder tlsHostname(@Nullable Output<String> tlsHostname) {
            $.tlsHostname = tlsHostname;
            return this;
        }

        public Builder tlsHostname(String tlsHostname) {
            return tlsHostname(Output.of(tlsHostname));
        }

        public Builder userName(Output<String> userName) {
            $.userName = userName;
            return this;
        }

        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        public DatastreamElasticsearchConnectorArgs build() {
            if ($.displayName == null) {
                throw new MissingRequiredPropertyException("DatastreamElasticsearchConnectorArgs", "displayName");
            }
            if ($.endpoint == null) {
                throw new MissingRequiredPropertyException("DatastreamElasticsearchConnectorArgs", "endpoint");
            }
            if ($.indexName == null) {
                throw new MissingRequiredPropertyException("DatastreamElasticsearchConnectorArgs", "indexName");
            }
            if ($.password == null) {
                throw new MissingRequiredPropertyException("DatastreamElasticsearchConnectorArgs", "password");
            }
            if ($.userName == null) {
                throw new MissingRequiredPropertyException("DatastreamElasticsearchConnectorArgs", "userName");
            }
            return $;
        }
    }

}
